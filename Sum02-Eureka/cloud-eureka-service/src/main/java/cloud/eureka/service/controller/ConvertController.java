package cloud.eureka.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by zqzhou2 on 2017/6/2.
 */
@RestController
@RequestMapping("/convert")
public class ConvertController {

    private final Logger logger = Logger.getLogger(ConvertController.class.toString());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/upper", method = RequestMethod.GET)
    public String upper(String str) {
        ServiceInstance instance = client.getLocalServiceInstance();
        String upperStr = str.toUpperCase();
        logger.info("/upper, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + upperStr);
        return upperStr;
    }
}
