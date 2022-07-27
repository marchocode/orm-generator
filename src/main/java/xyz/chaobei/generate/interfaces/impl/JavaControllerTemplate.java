package xyz.chaobei.generate.interfaces.impl;

import xyz.chaobei.generate.interfaces.AbstractTemplate;

/**
 * @description: JAVA实体类的模板配置
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/24
 **/
public class JavaControllerTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/controller.java.vm";
    }

    @Override
    public String templateName() {
        return "JavaController";
    }

    @Override
    public int order() {
        return 7;
    }

    @Override
    public String packageName() {
        return "controller";
    }

    @Override
    public String fileName(String tableName) {
        return String.format("Api%sController",super.upperCamel(tableName));
    }

    @Override
    public String fileType() {
        return JAVA_TYPE;
    }

}
