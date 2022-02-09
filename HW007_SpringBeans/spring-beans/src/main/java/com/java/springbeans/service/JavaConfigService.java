package com.java.springbeans.service;

public class JavaConfigService {

    private final String timeOfInitialization;

    private Integer dayOfMonth;

    public JavaConfigService(String timeOfInitialization) {
        this.timeOfInitialization = timeOfInitialization;
    }

    public String hello() {
        return "Hello from java config!" + " time: " + timeOfInitialization
                + " datOfMonth:" + dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
}
