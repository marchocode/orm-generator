package xyz.chaobei.generate.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.chaobei.generate.interfaces.TemplateHandler;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: <a href='mailto:maruichao52@gmail.com'>MRC</a>
 * @since 2022/6/26
 **/
@SpringBootTest
class GenerateServiceTest {

    @Resource
    private GenerateService generateService;

    @Test
    void generate() {
        generateService.generate("org_user");
    }

    @Test
    void getTemplateList() {
        for (TemplateHandler templateHandler : generateService.getTemplateHandlers()) {
            System.out.println(templateHandler.templateName());
        }
    }

}