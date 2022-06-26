package xyz.chaobei.generate.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import xyz.chaobei.generate.entity.ColumnEntityExtend;
import xyz.chaobei.generate.entity.TableEntityExtend;

import java.util.List;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@Component
@Getter
@Setter
public class ContextConfig {

    private TableEntityExtend table;

    private List<ColumnEntityExtend> columns;

}
