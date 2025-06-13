package com.tarealogin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private int id;
    private String username;
    private String password;
    private String role;
    private int id_person;
    private Timestamp creation_date;
    private Timestamp last_update;
    private boolean active;

}
