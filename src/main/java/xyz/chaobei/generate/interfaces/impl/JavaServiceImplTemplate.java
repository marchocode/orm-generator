package xyz.chaobei.generate.interfaces.impl;

import xyz.chaobei.generate.interfaces.AbstractTemplate;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/30
 **/
public class JavaServiceImplTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/service-impl.java.vm";
    }

    @Override
    public String templateName() {
        return "JavaServiceImpl";
    }

    @Override
    public int order() {
        return 6;
    }

    @Override
    public String packageName() {
        return "service.impl";
    }

    @Override
    public String fileName(String tableName) {
        return String.format("%sImpl" , upperCamel(tableName));
    }

    @Override
    public String fileType() {
        return JAVA_TYPE;
    }
}
