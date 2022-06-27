package xyz.chaobei.generate.interfaces.impl;

import org.springframework.stereotype.Component;
import xyz.chaobei.generate.interfaces.AbstractTemplate;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/24
 **/
@Component
public class JavaMapperTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/mapper.java.vm";
    }

    @Override
    public int order() {
        return 1;
    }

    @Override
    public String templateName() {
        return "JavaMapper";
    }

    @Override
    public String packageName() {
        return "mapper";
    }

    @Override
    public String fileName(String tableName) {
        return String.format("%sMapper", upperCamel(tableName));
    }

    @Override
    public String fileType() {
        return JAVA_TYPE;
    }

}
