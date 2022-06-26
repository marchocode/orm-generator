package xyz.chaobei.generate.mapper;

import xyz.chaobei.generate.entity.ColumnEntity;
import xyz.chaobei.generate.entity.TableEntity;

import java.util.List;

/***
 * <p> 查询数据库,获得字段信息
 * @author MRC
 * @since 2022/6/24
 **/
public interface GenerateMapper {

    /**
     * <p>通过指定表名的方式查询
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param name 表名称
     * @return xyz.chaobei.generate.entity.TableEntity
     * @since 2022/6/24
     **/
    TableEntity selectTable(String name);

    /**
     * <p>查询当前数据库所有的表信息
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @return java.util.List<xyz.chaobei.generate.entity.TableEntity>
     * @since 2022/6/24
     **/
    List<TableEntity> tableList();

    /**
     * <p>指定表所有的字段信息
     * <p>author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
     *
     * @param name 指定表
     * @return java.util.List<xyz.chaobei.generate.entity.ColumnEntity>
     * @since 2022/6/24
     **/
    List<ColumnEntity> selectColumns(String name);
}