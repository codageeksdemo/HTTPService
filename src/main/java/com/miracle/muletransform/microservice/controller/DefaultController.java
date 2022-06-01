package com.miracle.muletransform.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("${default.controller.path.map}")
class DefaultController {
  
  @GetMapping("/")	
  
  String home() {
    return "Hello, Welcome to Mule Transform demo! ";
  }
}
