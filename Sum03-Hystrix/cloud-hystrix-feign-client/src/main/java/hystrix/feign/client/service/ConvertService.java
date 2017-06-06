package hystrix.feign.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zqzhou2 on 2017/6/6.
 */
@FeignClient(value = "convert-service", fallback = ConvertServiceHystrix.class)
public interface ConvertService {

    @RequestMapping(value = "convert/upper", method = RequestMethod.GET)
    String upper(@RequestParam(value = "str") String str);
}
