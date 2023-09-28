package com.voyager.springbootstarterapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyager.springbootstarterapp.entity.AppConfigurationEntity;
import com.voyager.springbootstarterapp.model.AppConfiguration;
import com.voyager.springbootstarterapp.repository.AppConfigurationRepository;

@Service
public class AppConfigFetcher {

    private final AppConfigurationRepository appConfigurationRepository;
    private List<AppConfiguration> configurations; 
    List<AppConfigurationEntity> entities;

    @Autowired
    public AppConfigFetcher(AppConfigurationRepository appConfigurationRepository) {
        this.appConfigurationRepository = appConfigurationRepository;
        this.configurations = new ArrayList<>();
        this.entities = new ArrayList<>();
    }

    // Lazy initialization method to fetch configurations from the database only if needed
    private synchronized void ensureConfigurationsFetched(List<String> propertyKeys) {
        if (entities.isEmpty()) {
            entities = appConfigurationRepository.findByPropertyKeyIn(propertyKeys);
            for (AppConfigurationEntity entity : entities) {
                AppConfiguration config = new AppConfiguration();
                config.setId(entity.getId());
                config.setAppName(entity.getAppName());
                config.setPropertyKey(entity.getAppName());
                config.setPropertyValue(entity.getPropertyValue());
                config.setEnabled(entity.getEnabled());
                configurations.add(config);
            }
        }
    }

    public List<AppConfigurationEntity> getConfigurations(List<String> propertyKeys) {
        if(entities.isEmpty())
        ensureConfigurationsFetched(propertyKeys); // Ensure configurations are fetched before returning
        return entities;
    }

    // You can also add methods to add or modify configurations in the list if needed
    // public void addConfiguration(AppConfiguration configuration) { ... }
    // public void updateConfiguration(AppConfiguration configuration) { ... }
}
