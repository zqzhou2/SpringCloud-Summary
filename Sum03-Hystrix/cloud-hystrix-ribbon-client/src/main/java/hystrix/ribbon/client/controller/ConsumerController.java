package hystrix.ribbon.client.controller;

import hystrix.ribbon.client.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zqzhou2 on 2017/6/4.
 */
@RestController
public class ConsumerController {

    @Autowired
    ConvertService convertService;

    @RequestMapping(value = "/upper", method = RequestMethod.GET)
    public String upper(String str) {
        return this.convertService.upper(str);
    }
}
