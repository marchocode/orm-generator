package xyz.chaobei.generate.interfaces.impl;

import org.springframework.stereotype.Component;
import xyz.chaobei.generate.interfaces.AbstractTemplate;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/23
 **/
@Component("javaEntityTemplate")
public class JavaEntityTemplate extends AbstractTemplate {

    @Override
    public String templatePath() {
        return "generate/entity.java.vm";
    }

    @Override
    public String packageName() {
        return "entity.desc";
    }

    @Override
    public String fileName(String tableName) {
        return String.format("%s.java" , upperCamel(tableName));
    }
}
