package com.huppert.eurekacilent;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hyp 1774549483@qq.com
 * @version v1.0
 * @Title:com.huppert.eurekacilent
 * @description
 * @date 2018/11/15 13:47
 * fallback = HiHystrix.class 配置如果出现获取不到信息的情况从哪取数据
 * HiHystrix实现SchedualService，可以配置每个方法获取不到数据返回的信息
 * 对于影响很大，或者影响流程的操作可以使用熔断机制
 */
@FeignClient(value = "eureka-client2" ,fallback = HiHystrix.class) //调用其服务的服务名  即上一条
public interface SchedualService {

    @RequestMapping(value="/test",method= RequestMethod.POST)
    public String gethi();

}