package cloud.config.client;

import cloud.config.client.controller.ConfigController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zqzhou2 on 2017/6/2.
 */
@Configuration
@EnableAutoConfiguration
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigController.class, args);
    }
}
