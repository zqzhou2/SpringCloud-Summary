package cloud.ribbon.client.controller;

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
    RestTemplate restTemplate;

    @RequestMapping(value = "/upper", method = RequestMethod.GET)
    public String upper(String str) {
        return restTemplate.getForEntity("http://CONVERT-SERVICE/convert/upper?str=" + str, String.class).getBody();
    }
}
