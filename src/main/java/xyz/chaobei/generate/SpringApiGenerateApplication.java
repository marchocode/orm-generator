package xyz.chaobei.generate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

public class SpringApiGenerateApplication {

    public static void main(String[] args) throws SQLException, IOException {

        Properties properties = new Properties();
        properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("orm-config.properties"));

        String string = properties.getProperty("orm.datasource.driver-class-name");
        System.out.println(string);

    }

}
