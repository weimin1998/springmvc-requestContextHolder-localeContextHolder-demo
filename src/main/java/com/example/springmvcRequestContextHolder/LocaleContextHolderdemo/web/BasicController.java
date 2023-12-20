package com.example.springmvcRequestContextHolder.LocaleContextHolderdemo.web;

import com.example.springmvcRequestContextHolder.LocaleContextHolderdemo.pojo.User;
import com.example.springmvcRequestContextHolder.LocaleContextHolderdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BasicController {

    @Autowired
    UserService userService;

    // http://127.0.0.1:8080/user
    @RequestMapping("/user")
    @ResponseBody
    public User user() {

        return userService.getUser();
    }

}
