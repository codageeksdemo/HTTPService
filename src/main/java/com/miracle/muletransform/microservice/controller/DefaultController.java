package com.miracle.muletransform.microservice.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.labs.microservice.transform.web.model.TransformRequest;

@RestController()
@RequestMapping("${default.controller.path.map}")
class DefaultController {
  
  @GetMapping("/")	
  
  String home() {
    return "Hello, Welcome to Mule Transform demo! ";
  }
  
  @PutMapping(path = {"/"}, consumes = {"application/json"})
  String receive(@RequestBody String request) throws ClassNotFoundException, IOException, InterruptedException {
    
    
    return "success";
  }
}
