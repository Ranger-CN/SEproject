package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-12T01:02:31.617Z")

@RestSchema(schemaId = "projectdemo")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class ProjectdemoImpl {

    @Autowired
    private ProjectdemoDelegate userProjectdemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectdemoDelegate.helloworld(name);
    }

}
