package xyz.chaobei.generate.interfaces.impl;

import xyz.chaobei.generate.interfaces.AbstractTemplate;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/30
 **/
public class JavaVOTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/vo.java.vm";
    }

    @Override
    public String templateName() {
        return "JavaVO";
    }

    @Override
    public int order() {
        return 4;
    }

    @Override
    public String packageName() {
        return "entity.vo";
    }

    @Override
    public String fileName(String tableName) {
        return String.format("%sVO" , upperCamel(tableName));
    }

    @Override
    public String fileType() {
        return JAVA_TYPE;
    }
}
