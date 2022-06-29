package xyz.chaobei.generate.entity;

import com.google.common.base.CaseFormat;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@Getter
@ToString
public class ColumnEntityExtend extends ColumnEntity {

    /**
     * java 数据类型
     */
    private String javaType;

    /**
     * java 字段
     */
    private String javaColumn;

    public ColumnEntityExtend(ColumnEntity columnEntity) {
        super(columnEntity);
    }

    public void cover(Map<String, String> typeMap) {
        this.javaType = typeMap.containsKey(super.getDataType()) ? typeMap.get(super.getDataType()) : "Object";
        this.javaColumn = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, getColumn());
    }

    public boolean isPrimary() {
        return "PRI".equals(getColumnKey());
    }

}
