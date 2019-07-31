package com.StackRoute.controller;

import com.StackRoute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//makes a class as Controller

@RequestMapping("/login")
//Maps the process of login page with the below class,
//Mapping with class
public class LoginController {
    @RequestMapping("/")
//    Mapping with Method
    public ModelAndView getLogin(@ModelAttribute("userName") String userName, @ModelAttribute("userPassword") String userPassword)
    {
        User user=new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
//        Creation of ModelAndView to set Viewname,and any objects needed to that view
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("welcome");
        modelAndView.addObject("userName",user.getUserName());
        return modelAndView;
    }
    @RequestMapping("/loginpage")
    public String getLoginPage()
    {
        return "loginpage";
    }
}
