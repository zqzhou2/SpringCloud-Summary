package hystrix.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by zqzhou2 on 2017/6/6.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HystrixFrignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFrignClientApplication.class, args);
    }
}
