package org.pan.controller;

import org.pan.bean.LoginUser;
import org.pan.repository.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by panmingzhi on 2016/10/14.
 */
@RestController
public class LoginUserController {

    @Autowired
    private LoginUserRepository loginUserRepository;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    LoginUser login() {
        String id = UUID.randomUUID().toString();
        LoginUser loginUser = new LoginUser();
        loginUser.setId(id);
        loginUser.setUsername("panmingzhi");
        loginUserRepository.save(loginUser);
        return loginUserRepository.findOne(id);
    }
}
