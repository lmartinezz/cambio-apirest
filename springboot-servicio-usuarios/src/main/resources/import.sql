INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$WImqWvOtQMGOqrO.FO6kaO1IdeOYBwaIY8jRbV1MBm.3.ih1Hu742' ,true , 'Andres', 'Guzman', 'profesor@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$brz6mFUSMjofZMllCJY.iOUrO2WSVft5V.KrbEzxJUslHCJCYYlai' ,true , 'Jhon', 'Doe', 'jhon.doe@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);