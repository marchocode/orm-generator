package xyz.chaobei.generate.config;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@SpringBootTest
class GenerateConfigTest {

    @Resource
    private GenerateConfig generateConfig;

    @Test
    void getGroupId() {
        System.out.println(generateConfig.getGroupId());
    }

    @Test
    void getTypeMap() {
        System.out.println(JSON.toJSONString(generateConfig.getTypeMap()));
    }
}