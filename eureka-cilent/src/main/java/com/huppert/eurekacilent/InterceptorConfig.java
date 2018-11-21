package com.huppert.eurekacilent;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hyp 1774549483@qq.com
 * @version v1.0
 * @Title:com.huppert.eurekacilent
 * @description
 * @date 2018/11/19 17:50
 * //可以用来做单点登录验证
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginCheckInterceptor()).excludePathPatterns("/sso/doLogin", "/test/**");
        super.addInterceptors(registry);
    }

    class LoginCheckInterceptor implements HandlerInterceptor {

        @Override
        public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
                throws Exception {
                System.out.println("Interceptor   comp");
        }

        @Override
        public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
                throws Exception {
            System.out.println("Interceptor  post");
        }

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj)
                throws Exception {
            System.out.println("Interceptor  preHandle");
            //preHandle表示在之前验证，return返回true说明通过验证，返回false表示验证失败，false后不会继续向下走

            return true;
        }



    }
}
