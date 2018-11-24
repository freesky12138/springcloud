package com.huppert.eurekacilent2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyp 1774549483@qq.com
 * @version v1.0
 * @Title:com.huppert.eurekacilent
 * @description
 * @date 2018/11/14 9:30
 */
@RestController
public class HelloControl {

    @RequestMapping(value = "/test", method = { RequestMethod.POST })
    public String test(){
        return "eureka-client2";
    }
}
