package com.voyager.springbootstarterapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "app_configuration")
public class AppConfigurationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "APP_NAME")
    private String appName;
    @Column(name = "PROPERTY_KEY")
    private String propertyKey;
    @Column(name = "PROPERTY_VALUE")
    private String propertyValue;
    @Column(name = "ENABLED")
    private Boolean enabled;
    // Constructors, getters, and setters   
}