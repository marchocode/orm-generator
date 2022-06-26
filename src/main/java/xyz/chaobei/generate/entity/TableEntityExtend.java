package xyz.chaobei.generate.entity;

import com.google.common.base.CaseFormat;
import lombok.Getter;
import lombok.ToString;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@Getter
@ToString
public class TableEntityExtend extends TableEntity {

    public TableEntityExtend(TableEntity tableEntity) {
        super(tableEntity);
    }

    public String className() {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getName());
    }
}
