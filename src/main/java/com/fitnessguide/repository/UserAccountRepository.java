package com.fitnessguide.repository;

import com.fitnessguide.model.LoginDTO;
import com.fitnessguide.model.SignUpDTO;
import org.springframework.stereotype.Repository;

@Repository
public class UserAccountRepository {

    public String signUp(SignUpDTO signUpDTO) {
        return "User " + signUpDTO.getFirstName() + " " + signUpDTO.getLastName() + " registered successfully";
    }

    public String login(LoginDTO loginDTO) {
        return "User logged in successful";
    }

}
