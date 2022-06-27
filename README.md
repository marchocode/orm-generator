## ORM-GENERATOR

> 自动生成代码利器，不再做CRUD程序猿



### :star: Get Start

```shell
git clone https://github.com/marcho-code/orm-generator.git
cd orm-generator
```



### :dart: Support Database

1. :white_check_mark: MySQL

2. :white_large_square: Oracle

3. :white_large_square: MongoDB



### :speech_balloon: Plan

1. :white_check_mark: 基础支持MySQL

2. :white_check_mark: 内置 Controller+Service+Mapper+Entity 模板

3. :white_large_square: 支持其他数据源

4. :white_large_square: 支持多种编程语言





### :key: Context Variable

| 内置变量    |                    | 说明     | 举例        |
| ------- | ------------------ | ------ | --------- |
| table   | table.name         | 数据库名称  | org_user  |
|         | table.engine       | 数据库引擎  | innodb    |
|         | table.createTime   | 创建时间   |           |
|         |                    |        |           |
| columns | item in columns    |        |           |
|         | item.columnKey     | 主键标识   | PRI       |
|         | item.column        | 数据库字段名 | create_id |
|         | item.dataType      | 数据库类型  | varchar   |
|         | item.columnComment | 字段备注   |           |
|         | item.isNullable    | 是否允许为空 | YES/NO    |



### :construction: Customer Template

For example:

```java

```



### :clinking_glasses: Link

- [Apache velocity](https://velocity.apache.org/)

- 