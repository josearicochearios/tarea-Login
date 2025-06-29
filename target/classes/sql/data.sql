USE tarealogin_db;

-- Insertar personas
INSERT INTO person
(name, last_name, gender, dni, phone, landline, email, creation_date, last_update, active)
VALUES
    ('Juan', 'Pérez', 'M', '12345678', '987654321', '012345678', 'juan.perez@email.com', NOW(), NOW(), TRUE),
    ('María', 'Gómez', 'F', '87654321', '912345678', '011223344', 'maria.gomez@email.com', NOW(), NOW(), TRUE),
    ('Carlos', 'Ramírez', 'M', '23456789', '934567890', NULL, 'carlos.ramirez@email.com', NOW(), NOW(), TRUE),
    ('Lucía', 'Fernández', 'F', '34567890', '945678901', '013344556', 'lucia.fernandez@email.com', NOW(), NOW(), TRUE),
    ('Pedro', 'López', 'M', '45678901', '956789012', NULL, 'pedro.lopez@email.com', NOW(), NOW(), TRUE),
    ('Ana', 'Martínez', 'F', '56789012', '967890123', '017788990', 'ana.martinez@email.com', NOW(), NOW(), TRUE),
    ('Luis', 'Sánchez', 'M', '67890123', '978901234', '016655443', 'luis.sanchez@email.com', NOW(), NOW(), TRUE),
    ('Sofía', 'Torres', 'F', '78901234', '989012345', NULL, 'sofia.torres@email.com', NOW(), NOW(), TRUE),
    ('Diego', 'Ruiz', 'M', '89012345', '900123456', '014477889', 'diego.ruiz@email.com', NOW(), NOW(), TRUE),
    ('Laura', 'Castillo', 'F', '90123456', '911234567', '010101010', 'laura.castillo@email.com', NOW(), NOW(), TRUE);

-- Insertar usuarios (user_app)
INSERT INTO user_app
(username, password, role, id_person, creation_date, last_update, active)
VALUES
    ('juanp', 'Axcdweq$87', 'admin', 1, NOW(), NOW(), TRUE),
    ('mariag', 'Bwerplo@99', 'user', 2, NOW(), NOW(), TRUE),
    ('carlosr', 'Ctyuir#65', 'user', 3, NOW(), NOW(), TRUE),
    ('luciaf', 'Dsdfgq$74', 'moderator', 4, NOW(), NOW(), TRUE),
    ('pedrol', 'Ecvxrw@33', 'admin', 5, NOW(), NOW(), TRUE),
    ('anam', 'Fghjtz#56', 'user', 6, NOW(), NOW(), TRUE),
    ('luiss', 'Gbnmer$41', 'user', 7, NOW(), NOW(), TRUE),
    ('sofiat', 'Hplmkj@28', 'moderator', 8, NOW(), NOW(), TRUE),
    ('diegor', 'Iasdfg#91', 'admin', 9, NOW(), NOW(), TRUE),
    ('laurac', 'Jqweop$62', 'user', 10, NOW(), NOW(), TRUE);
