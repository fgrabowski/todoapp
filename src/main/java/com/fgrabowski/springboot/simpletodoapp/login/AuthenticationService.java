package com.fgrabowski.springboot.simpletodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUsername = username.equals("admin");
        boolean isValidPassword = password.equals("admin");

        return isValidUsername && isValidPassword;
    }
}
