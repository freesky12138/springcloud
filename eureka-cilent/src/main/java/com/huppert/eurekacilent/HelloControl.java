package com.huppert.eurekacilent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author hyp 1774549483@qq.com
 * @version v1.0
 * @Title:com.huppert.eurekacilent
 * @description
 * @date 2018/11/14 9:30
 */
@RestController
public class HelloControl {

    @Autowired
    private SchedualService schedualService;

    //FeignClient适合统一配置，RestTemplate适合单独调用
    @Autowired
    private RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(HelloControl.class);

    @RequestMapping(value = "/test", method = { RequestMethod.POST })
    public String test(){
        return schedualService.gethi();
    }

    @RequestMapping(value = "/resttemplate/test", method = { RequestMethod.POST })
    public String resttemplateTest(){

        //restTemplate.getForObject是get方法
        return restTemplate.postForObject("http://eureka-client2/test","{}",String.class);
    }

    @RequestMapping(value = "/interceptor/test", method = { RequestMethod.POST })
    public String interceptorTest(){
        logger.info("logger");
        return schedualService.gethi();
    }

    @RequestMapping(value = "/test/error", method = { RequestMethod.POST })
    public String testError() throws Exception {
        throw new Exception();
    }
}
