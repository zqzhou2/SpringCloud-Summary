package hystrix.ribbon.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zqzhou2 on 2017/6/5.
 */
@Service
public class ConvertService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "upperFallback")
    public String upper(String str) {
        return restTemplate.getForEntity("http://CONVERT-SERVICE/convert/upper?str=" + str, String.class).getBody();
    }

    public String upperFallback() {
        return "invoke error.";
    }

    /**
     * 回调方法，参数需一致
     *
     * @param str
     * @return
     */
    public String upperFallback(String str) {
        return "params " + str + ", invoke error.";
    }
}