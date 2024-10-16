package com.ohgiraffers.section01.question;

import java.util.ArrayList;
import java.util.List;

public class UserPage {
    private String username;
    private String password;

    public UserPage(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
