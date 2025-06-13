USE defaultdb;

CREATE DATABASE tarealogin_db;

USE tarealogin_db;

CREATE TABLE person (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        last_name VARCHAR(100) NOT NULL,
                        gender CHAR(1) NOT NULL CHECK (gender IN ('M', 'F')),
                        dni CHAR(8) NOT NULL UNIQUE,
                        phone CHAR(9) NOT NULL,
                        landline CHAR(9),
                        email VARCHAR(100) NOT NULL UNIQUE,
                        creation_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
                        last_update DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        active BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE user_app (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          username VARCHAR(100) NOT NULL UNIQUE,
                          password VARCHAR(100) NOT NULL,
                          role VARCHAR(20) NOT NULL,
                          id_person INT NOT NULL,
                          creation_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
                          last_update DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                          active BOOLEAN NOT NULL DEFAULT TRUE,
                          FOREIGN KEY (id_person) REFERENCES person(id)
                              ON DELETE RESTRICT
                              ON UPDATE CASCADE
);
