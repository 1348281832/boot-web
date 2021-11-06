package com.aman.boot.bootweb.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration(proxyBeanMethods = false)
public class MyHiddenHttpMethodFilter {

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter()
    {
        HiddenHttpMethodFilter mf=new HiddenHttpMethodFilter();
        mf.setMethodParam("_mymethod");
        return mf;
    }
}
