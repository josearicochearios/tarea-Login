package com.tarealogin.controller;

import com.tarealogin.database.PersonDAO;
import com.tarealogin.model.PersonEntity;

public class PersonController {

    private PersonDAO dao;

    public PersonController() {
        dao = new PersonDAO();
    }

    public PersonEntity getPersonById(int id) {
        try {
            return dao.getFullnameById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
