package config.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zqzhou2 on 2017/6/6.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaClientApplication.class, args);
    }
}
