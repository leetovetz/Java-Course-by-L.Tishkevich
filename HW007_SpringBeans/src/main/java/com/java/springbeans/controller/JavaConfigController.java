package com.java.springbeans.controller;

import com.java.springbeans.service.JavaConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaConfigController {

    private final  JavaConfigService javaConfig;

    @Autowired
    public JavaConfigController(@Qualifier("FullJavaConfigService") JavaConfigService javaConfig) {
        this.javaConfig = javaConfig;
    }

    @GetMapping("/java")
    public String hello() {
        return javaConfig.hello();

    }
}
