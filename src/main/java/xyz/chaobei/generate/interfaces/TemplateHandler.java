package xyz.chaobei.generate.interfaces;

import org.apache.velocity.Template;

import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/21
 **/
public interface TemplateHandler {

    Template template();

    Writer writer() throws IOException;

    void build();

    /**
     * 当前文件存放的文件夹地址
     *
     * @return
     */
    String packageName();

    /**
     * 设置文件名
     *
     * @return 返回文件名
     */
    default String fileName(String tableName) {
        return tableName;
    }

    // void addAddition(String key, String value);

}
