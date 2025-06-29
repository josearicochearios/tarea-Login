package com.tarealogin.controller;

import com.tarealogin.database.UserDAO;
import com.tarealogin.model.UserEntity;

public class UserController {

    private final UserDAO dao;

    public UserController() {
        dao = new UserDAO();
    }

    public UserEntity verifyCredential(String username, String password) {
        try {
            return dao.verifyCredentials(username, password);
        } catch ( Exception e ) {
            e.printStackTrace();
            return null;
        }
    }
}
