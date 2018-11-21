package com.huppert.eurekacilent;

import org.springframework.stereotype.Component;

/**
 * @author hyp 1774549483@qq.com
 * @version v1.0
 * @Title:com.huppert.eurekacilent2
 * @description
 * @date 2018/11/21 16:10
 */
@Component
public class HiHystrix implements SchedualService{
    @Override
    public String gethi() {
        return "no data error";
    }
}
