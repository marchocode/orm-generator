package xyz.chaobei.generate.interfaces.impl;

import org.springframework.stereotype.Component;
import xyz.chaobei.generate.interfaces.AbstractTemplate;

@Component
public class JavaMappingTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/mapping.xml.vm";
    }

    @Override
    public String templateName() {
        return "JavaMapping";
    }

    @Override
    public String packageName() {
        return "mapping";
    }

    @Override
    public String fileName(String tableName) {
        return upperCamel(tableName);
    }

    @Override
    public String fileType() {
        return XML_TYPE;
    }

    @Override
    public int order() {
        return 3;
    }
}
