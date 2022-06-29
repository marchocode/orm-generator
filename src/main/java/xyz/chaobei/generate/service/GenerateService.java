package xyz.chaobei.generate.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.app.Velocity;
import org.springframework.stereotype.Service;
import xyz.chaobei.generate.config.ContextConfig;
import xyz.chaobei.generate.config.GenerateConfig;
import xyz.chaobei.generate.entity.ColumnEntity;
import xyz.chaobei.generate.entity.ColumnEntityExtend;
import xyz.chaobei.generate.entity.TableEntity;
import xyz.chaobei.generate.entity.TableEntityExtend;
import xyz.chaobei.generate.interfaces.TemplateHandler;
import xyz.chaobei.generate.mapper.GenerateMapper;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@Service("generateService")
@Slf4j
@Getter
public class GenerateService {

    @Resource
    private GenerateMapper generateMapper;

    @Resource
    private GenerateConfig generateConfig;

    @Resource
    private ContextConfig contextConfig;

    @Resource
    private List<TemplateHandler> templateHandlers;

    @PostConstruct
    public void init() {
        templateHandlers.sort(Comparator.comparingInt(TemplateHandler::order));
    }

    public void generate(String tableEntity) {
        this.generate(generateMapper.selectTable(tableEntity));
    }

    /**
     * <p>开始生成代码
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param tableEntity 需要生成的表
     * @return void
     * @since 2022/6/26
     **/
    public void generate(TableEntity tableEntity) {

        Properties prop = new Properties();
        prop.put("file.resource.loader.class" , "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(prop);

        TableEntityExtend table = new TableEntityExtend(tableEntity);
        contextConfig.setTable(table);

        final Map<String, String> typeMap = generateConfig.getTypeMap();
        log.info("generate,typeMap={}" , typeMap);

        List<ColumnEntity> columnEntityList = generateMapper.selectColumns(tableEntity.getName());
        log.info("generate,columnEntityList={}" , columnEntityList);

        List<ColumnEntityExtend> collectExtend = columnEntityList.stream().map(ColumnEntityExtend::new).collect(Collectors.toList());
        collectExtend.stream().forEach(columnEntityExtend -> columnEntityExtend.cover(typeMap));

        ColumnEntityExtend primaryKey = collectExtend.stream().filter(ColumnEntityExtend::isPrimary).findFirst().orElse(null);
        log.info("generate,primaryKey={}" , primaryKey);

        contextConfig.setPrimaryKey(primaryKey);

        log.info("generate,collectExtend={}" , collectExtend);
        contextConfig.setColumns(collectExtend);

        templateHandlers.forEach(item -> item.build());
    }


}
