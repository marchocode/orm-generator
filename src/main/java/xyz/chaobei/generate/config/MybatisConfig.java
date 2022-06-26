package xyz.chaobei.generate.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"xyz.chaobei.generate.mapper"})
public class MybatisConfig {

}
