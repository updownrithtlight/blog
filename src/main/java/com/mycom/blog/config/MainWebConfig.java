package com.mycom.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class MainWebConfig implements WebMvcConfigurer {

    private MainInterceptor mainInterceptor;

    public MainWebConfig(MainInterceptor mainInterceptor) {
        this.mainInterceptor = mainInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mainInterceptor).excludePathPatterns("/login", "/swagger-ui.html", "/v2/api-docs", "/webjars/**", "/swagger-resources/**").addPathPatterns("/**");
    }




}
