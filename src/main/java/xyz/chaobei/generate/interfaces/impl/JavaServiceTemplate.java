package xyz.chaobei.generate.interfaces.impl;

import org.springframework.stereotype.Component;
import xyz.chaobei.generate.interfaces.AbstractTemplate;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/30
 **/
@Component
public class JavaServiceTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/service.java.vm";
    }

    @Override
    public String templateName() {
        return "JavaService";
    }

    @Override
    public int order() {
        return 5;
    }

    @Override
    public String packageName() {
        return "service";
    }

    @Override
    public String fileName(String tableName) {
        return String.format("%sService" , upperCamel(tableName));
    }

    @Override
    public String fileType() {
        return JAVA_TYPE;
    }
}
