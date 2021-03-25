package com.mycom.blog.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class MainInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        try {
//            HandlerMethod handlerMethod = (HandlerMethod) handler; //save log
//            Log operationLog = handlerMethod.getMethod().getDeclaredAnnotation(Log.class);
//            operationLogService.save(operationLog);
//        } catch (Exception e) {
//            log.error("LogInterceptor error!", e);
//        }
    }

 /*   @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (SessionHelper.current() == null) {
            throw new UnauthorizedException();
        }
        return true;
    }*/

}
