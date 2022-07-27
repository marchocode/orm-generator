package xyz.chaobei.generate.config;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/21
 **/
@Getter
@Setter
public class GenerateConfig {

    /**
     * 参考pom 例如org.apache
     */
    private String groupId;

    /**
     * 生成文件目录
     */
    private String generateDir;

    /**
     * 数据库字段与mapper的映射
     */
    private Map<String, String> typeMap;


}
