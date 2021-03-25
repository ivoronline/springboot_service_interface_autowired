package com.ivoronline.springboot_service_interface_autowired.controllers;

import com.ivoronline.springboot_service_interface_autowired.services.MyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @Autowired MyServiceInterface myService;

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {

    //CALL SERVICE
    String result = myService.hello();

    //RETURN RESULT
    return result;

  }

}


