package config.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zqzhou2 on 2017/6/2.
 */
@RefreshScope
@RestController
@EnableAutoConfiguration
public class ConfigController {

    @Value("${test.msg}")
    private String msg;

    @RequestMapping("/config")
    public String config() {
        return this.msg;
    }
}
