package hystrix.feign.client.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zqzhou2 on 2017/6/6.
 */
@Component
public class ConvertServiceHystrix implements ConvertService {

    @Override
    public String upper(@RequestParam(value = "str") String str) {
        return "params " + str + ", invoke error.";
    }
}
