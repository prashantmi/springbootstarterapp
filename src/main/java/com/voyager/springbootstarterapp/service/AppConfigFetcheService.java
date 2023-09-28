package com.voyager.springbootstarterapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.voyager.springbootstarterapp.entity.AppConfigurationEntity;
import com.voyager.springbootstarterapp.model.AppConfiguration;

@Service
public class AppConfigFetcheService {

    @Value("${tds.featurelist.property}")
    private String featureList;

    @Autowired
    private AppConfigFetcher appConfigFetcher;

    public List<AppConfigurationEntity> processProperty() {
        String[] keys = featureList.split(",");
        // for (String key : keys) {
        //     System.out.println(key);
        // }
        return appConfigFetcher.getConfigurations(new ArrayList<>(Arrays.asList(keys)));
    }
}