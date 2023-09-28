package com.voyager.springbootstarterapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.voyager.springbootstarterapp.entity.AppConfigurationEntity;
import com.voyager.springbootstarterapp.exception.PasCoreException;
import com.voyager.springbootstarterapp.service.AppConfigFetcheService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = { "/pas/config/test" })
public class CodeSnipptTestCnt {

	@Autowired
	private AppConfigFetcheService appConfigFetcheService; 
	
    @RequestMapping(method = RequestMethod.GET)
    public List<AppConfigurationEntity> getAllResources(HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return appConfigFetcheService.processProperty();
    }

}