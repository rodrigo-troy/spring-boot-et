package com.rodrigotroy.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 * $ Project: spring-boot-et
 * User: rodrigotroy
 * Date: 22-05-22
 * Time: 17:50
 */
@Controller
public class AuthenticationController {
    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
