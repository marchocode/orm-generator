package xyz.chaobei.generate.config;

import lombok.Getter;
import lombok.Setter;
import xyz.chaobei.generate.entity.ColumnEntityExtend;
import xyz.chaobei.generate.entity.TableEntityExtend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@Getter
@Setter
public class ContextConfig {

    /**
     * 当前生成的表对象
     */
    private TableEntityExtend table;

    /**
     * 表所有的字段信息
     */
    private List<ColumnEntityExtend> columns;

    /**
     * 当前表的主键信息
     */
    private ColumnEntityExtend primaryKey;

    /**
     * 生成文件的包导入记录
     */
    private Map<String, String> importRecord = new HashMap<>();
}
