package com.example.springmvcRequestContextHolder.LocaleContextHolderdemo.service;

import com.example.springmvcRequestContextHolder.LocaleContextHolderdemo.pojo.User;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Service
public class UserService {
    public User getUser(){

        // service中获取请求、响应，除了直接从controller中传参，还有下面的方式
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert requestAttributes != null;
        HttpServletRequest request = requestAttributes.getRequest();
        HttpServletResponse response = requestAttributes.getResponse();
        System.out.println(request.getRequestURI());
        System.out.println(response);

        // LocaleContextHolder获取locale
        Locale locale = LocaleContextHolder.getLocale();
        System.out.println(locale);

        // request 获取locale
        System.out.println(request.getLocale());


        User user = new User();
        user.setName("theonefx");
        user.setAge(666);
        return user;
    }
}
