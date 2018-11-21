package com.huppert.eurekacilent;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hyp 1774549483@qq.com
 * @version v1.0
 * @Title:com.huppert.eurekacilent
 * @description
 * @date 2018/11/19 17:34
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @ExceptionHandler(value = Exception.class)
    @RequestMapping("/error")
    public Result defaultErrorHandler(HttpServletRequest req, Exception ex) throws Exception {

        return new Result("error");
    }
}
