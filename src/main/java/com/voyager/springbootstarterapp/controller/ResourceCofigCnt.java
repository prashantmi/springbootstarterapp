package com.voyager.springbootstarterapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.voyager.springbootstarterapp.exception.PasCoreException;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = { "/pas/config/resource" })
public class ResourceCofigCnt {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllResources(HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{resourceType}" }, method = RequestMethod.GET)
    public ResponseEntity<?> getResourceByType(@PathVariable(required = true) String resourceType,
            HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{resourceType}" }, method = RequestMethod.POST)
    public ResponseEntity<?> addResourceByType(@PathVariable(required = true) String resourceType,
            HttpServletRequest request, HttpServletRequest reponse,
            @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{resourceType}" }, method = RequestMethod.PUT)
    public ResponseEntity<?> modifyResourceByType(
            @PathVariable(required = true) String resourceType, HttpServletRequest request,
            HttpServletRequest reponse, @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

    @RequestMapping(value = { "/{resourceType}" }, method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteResourceByType(
            @PathVariable(required = true) String resourceType, HttpServletRequest request,
            HttpServletRequest reponse, @RequestBody String requestBody) throws PasCoreException {
        return null;
    }

}