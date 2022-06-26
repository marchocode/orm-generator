package xyz.chaobei.generate.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableEntity {
    /**
     * 表名称 org_user
     */
    private String name;
    /**
     * 表引擎
     */
    private String engine;
    /**
     * 表创建时间
     */
    private String createTime;

    public TableEntity() {
    }

    public TableEntity(TableEntity other) {
        this.name = other.getName();
        this.engine = other.getEngine();
        this.createTime = other.getCreateTime();
    }
}
