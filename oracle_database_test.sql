CREATE TABLE users_test
(
    id_user_test INT PRIMARY KEY,
    id_role INT,
    nombre VARCHAR(20),
    clave VARCHAR(20)
);

CREATE TABLE roles_user
(
    id_role INT PRIMARY KEY,
    role_name VARCHAR(20)
);

ALTER TABLE users_test ADD CONSTRAINT fk_roles_users FOREIGN KEY (id_role) REFERENCES roles_user(id_role);

SELECT * FROM users_test ut
INNER JOIN roles_user rus ON ut.id_role = rus.id_role;

INSERT INTO roles_user (id_role, role_name) VALUES(1, 'ADMIN');
INSERT INTO users_test (id_user_test, id_role, nombre, clave) VALUES(1, 1, 'Juan', '12345');

UPDATE roles_user SET role_name = 'ADMINISTRADOR' WHERE id_role = 1;

DELETE FROM users_test WHERE id_user_test = 1;

SELECT * FROM roles_user;