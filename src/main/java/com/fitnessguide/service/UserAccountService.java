package com.fitnessguide.service;

import com.fitnessguide.model.SignUpDTO;
import com.fitnessguide.model.LoginDTO;
import com.fitnessguide.repository.UserAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    public String signUpUser(SignUpDTO signUpDTO) {
        return userAccountRepository.signUp(signUpDTO);
    }

    public String loginUser(LoginDTO loginRequestBody) {
        return "";
    }
}
