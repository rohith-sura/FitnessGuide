package com.fitnessguide.controller;

import com.fitnessguide.model.SignUpDTO;
import com.fitnessguide.model.LoginDTO;
import com.fitnessguide.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/useraccount")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignUpDTO signUpRequestBody) {
        return userAccountService.signUpUser(signUpRequestBody);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginRequestBody) {
        return userAccountService.loginUser(loginRequestBody);
    }

}
