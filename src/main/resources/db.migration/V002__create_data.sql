INSERT INTO auditoriums (description)
VALUES ('Кинозал'),
       ('Малая сцена'),
       ('Большая сцена'),
       ('VIP комната');

INSERT INTO roles (name)
VALUES ('Администратор'),
       ('Выступающий'),
       ('Зритель');

INSERT INTO speakers (first_name, age, number_phone, email, photo)
VALUES ('Александр М', 32, 912345678, 'alexandr.m@mail.ru', NULL),
       ('Алексей А', 34, 998765432, 'alexey.a@rambler.ru', NULL),
       ('Пётр П', 40, 955555555, 'petr.p@yandex.ru', NULL),
       ('Мария М', 50, 977777777, 'maria.m@google.ru', NULL);

INSERT INTO reports (description, date_and_time_start, duration, speaker_id, auditorium_id)
VALUES ('Знакомство с Java', '2024-08-13 09:00:00', 1.5, 1, 1),
       ('Работа с Postman', '2024-08-14 09:00:00', 2.0, 2, 2),
       ('Всё о Spring Boot', '2024-08-15 09:00:00', 1.0, 3, 3),
       ('Подготовка к собеседованию', '2024-08-16 09:00:00', 1.5, 4, 4);

INSERT INTO viewers (first_name, phone_number, email)
VALUES ('Зритель №_1', 911111111, 'first.viewer@mail.ru'),
       ('Зритель №_2', 922222222, 'second.viewer@mail.ru'),
       ('Зритель №_3', 933333333, 'threed.viewer@mail.ru'),
       ('Зритель №_4', 944444444, 'fourth.viewer@mail.ru');

INSERT INTO speaker_roles (speaker_id, role_id)
VALUES (1, 2),
       (2, 2),
       (3, 2),
       (4, 2);

INSERT INTO report_viewers (report_id, viewer_id)
VALUES (1, 1),
       (1, 2),
       (2, 3),
       (3, 4),
       (4, 1),
       (4, 3);