package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-12T01:19:53.523Z")

@RestSchema(schemaId = "project51hp")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project51hpImpl {

    @Autowired
    private Project51hpDelegate userProject51hpDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject51hpDelegate.helloworld(name);
    }

}
