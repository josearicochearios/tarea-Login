package com.tarealogin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {

    private int id;
    private String name;
    private String last_name;
    private String gender;
    private int dni;
    private int phone;
    private String landlaine;
    private String email;
    private Timestamp creation_date;
    private Timestamp last_update;
    private boolean active;

}
