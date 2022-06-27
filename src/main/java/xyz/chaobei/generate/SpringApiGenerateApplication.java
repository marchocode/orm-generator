package xyz.chaobei.generate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.chaobei.generate.service.GenerateService;

@SpringBootApplication
public class SpringApiGenerateApplication implements CommandLineRunner {

    @Autowired
    private GenerateService generateService;

    public static void main(String[] args) {
        SpringApplication.run(SpringApiGenerateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        generateService.generate("org_user");
    }
}
