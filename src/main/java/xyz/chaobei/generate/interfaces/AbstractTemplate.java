package xyz.chaobei.generate.interfaces;

import com.google.common.base.CaseFormat;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import xyz.chaobei.generate.config.ContextConfig;
import xyz.chaobei.generate.config.GenerateConfig;

import javax.annotation.Resource;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/23
 **/
public abstract class AbstractTemplate implements TemplateHandler {

    @Resource
    private GenerateConfig generateConfig;

    @Resource
    private ContextConfig contextConfig;

    private Map<String, Object> context = new HashMap<>();

    @Override
    public Template template() {
        return Velocity.getTemplate(templatePath(), "UTF-8");
    }

    @Override
    public void build() {

        context.put("table" , contextConfig.getTable());
        context.put("columns" , contextConfig.getColumns());

        try {
            Template template = this.template();
            Writer writer = writer();
            template.merge(new VelocityContext(context), writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * <p>转换驼峰命名 org_user -> OrgUser
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param name 需要转换的字段
     * @return java.lang.String
     * @since 2022/6/24
     **/
    public String upperCamel(String name) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name);
    }

    @Override
    public Writer writer() throws IOException {

        String split = Matcher.quoteReplacement(File.separator);

        String fileName = fileName(contextConfig.getTable().getName());
        String packages = packageName();
        String fullPath = packages.replaceAll("\\." , split);
        String root = generateConfig.getGenerateDir();

        String dirPath = root.endsWith(split) ? root.concat(fullPath) : root.concat(split).concat(fullPath);
        String filePath = dirPath.endsWith(split) ? dirPath.concat(fileName) : dirPath.concat(split).concat(fileName);

        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }

        return new FileWriter(file);
    }

    /**
     * 获得模板所在路径
     *
     * @return
     */
    public abstract String templatePath();

}
