package com.StackRoute.controller;

import com.StackRoute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
//makes a class as Controller
public class MyAppController {
//  Homepage Mapping
  @RequestMapping("/")
  public String getGreetings(){
  return "index";
}

}

