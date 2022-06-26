package xyz.chaobei.generate.entity;

import lombok.Data;

/***
 * <p>数据库字段映射
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 *
 * @since 2022/6/24
 **/
@Data
public class ColumnEntity {

    /**
     * 是否是主键标识 主键 columnKey == "PRI" true
     */
    private String columnKey;

    /**
     * 原名称 create_id 数据库表名称
     */
    private String column;

    /**
     * 数据库类型
     */
    private String dataType;

    /**
     * 数据库对当前字段的备注
     */
    private String columnComment;

    /**
     * 是否为空，yes可以为空
     */
    private String isNullable;

    public ColumnEntity() {

    }

    public ColumnEntity(ColumnEntity other) {
        this.column = other.column;
        this.columnKey = other.columnKey;
        this.dataType = other.dataType;
        this.columnComment = other.columnComment;
        this.isNullable = other.isNullable;
    }

}