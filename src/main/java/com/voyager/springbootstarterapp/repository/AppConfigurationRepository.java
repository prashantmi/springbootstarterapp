package com.voyager.springbootstarterapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyager.springbootstarterapp.entity.AppConfigurationEntity;

public interface AppConfigurationRepository extends JpaRepository<AppConfigurationEntity, Long> {
    List<AppConfigurationEntity> findByPropertyKeyIn(List<String> propertyKeys);
    List<AppConfigurationEntity> findByAppName(String appName);

}