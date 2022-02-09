package com.java.springbeans.service;

public class HelloXmlService {

    private UtilsService utilsService;

    public String hello() {
        return utilsService.append("Hello from xml!");
    }

    public void setUtilsService(UtilsService utilsService) {
        this.utilsService = utilsService;
    }
}
