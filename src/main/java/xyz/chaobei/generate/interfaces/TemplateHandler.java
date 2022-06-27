package xyz.chaobei.generate.interfaces;

import org.apache.velocity.Template;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.Map;

/**
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/21
 **/
public interface TemplateHandler {

    String templateName();

    default int order() {
        return 0;
    }

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
        return tableName.concat(fileType());
    }


    /***
     * <p>指定生成文件的文件类型
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @return java.lang.String
     * @since 2022/6/27
     **/
    default String fileType() {
        return ".txt";
    }

    /**
     * <p>添加一些额外的变量到上下文
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @since 2022/6/27
     **/
    default Map<String, Object> addAddition() {
        return Collections.emptyMap();
    }

}
