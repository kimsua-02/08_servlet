package com.ohgiraffers.section01.question;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<UserPage> uesrs = new ArrayList<>();

    public static void addUser(UserPage uesr) {
        uesrs.add(uesr);
    }

    public static UserPage getUser(String username) {
        for (UserPage uesr : uesrs) {
            if (uesr.getUsername().equals(username)) {
                return uesr;
            }
        }
        return null;
    }
}
