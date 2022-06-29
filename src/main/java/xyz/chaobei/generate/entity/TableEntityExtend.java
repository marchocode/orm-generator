package xyz.chaobei.generate.entity;

import com.google.common.base.CaseFormat;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

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

}
