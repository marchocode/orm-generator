package xyz.chaobei.generate.mapper;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.chaobei.generate.entity.ColumnEntity;
import xyz.chaobei.generate.entity.TableEntity;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@SpringBootTest
class GenerateMapperTest {

    @Resource
    private GenerateMapper generateMapper;

    @Test
    void selectTable() {
        TableEntity tableEntity = generateMapper.selectTable("org_user");
        System.out.println(JSON.toJSONString(tableEntity));
    }

    @Test
    void tableList() {
        List<TableEntity> tableEntities = generateMapper.tableList();
        System.out.println(JSON.toJSONString(tableEntities));
    }

    @Test
    void selectColumns() {
        List<ColumnEntity> org_user = generateMapper.selectColumns("org_user");
        System.out.println(JSON.toJSONString(org_user));
    }
}