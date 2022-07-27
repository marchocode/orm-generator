package xyz.chaobei.generate.interfaces.impl;

import xyz.chaobei.generate.interfaces.AbstractTemplate;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/23
 **/
public class JavaEntityTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/entity.java.vm";
    }

    @Override
    public String templateName() {
        return "JavaEntity";
    }

    @Override
    public int order() {
        return 1;
    }

    @Override
    public String packageName() {
        return "entity.desc";
    }

    @Override
    public String fileName(String tableName) {
        return String.format("%sEntity", upperCamel(tableName));
    }

    @Override
    public String fileType() {
        return JAVA_TYPE;
    }
}
