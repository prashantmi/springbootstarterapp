package com.voyager.springbootstarterapp.model;

import lombok.Data;

@Data
public class AppConfiguration {
    private Long id;
    private String appName;
    private String propertyKey;
    private String propertyValue;
    private Boolean enabled;

    // Constructor, getters, and setters
}