CREATE TABLE auditoriums
(
    id          SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE roles
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE speakers
(
    id           SERIAL PRIMARY KEY,
    first_name   VARCHAR(255),
    age          INTEGER,
    number_phone INTEGER,
    email        VARCHAR(255),
    photo        BYTEA
);

CREATE TABLE reports
(
    id                  SERIAL PRIMARY KEY,
    description         VARCHAR(255),
    date_and_time_start TIMESTAMP,
    duration            DOUBLE PRECISION,
    speaker_id          INTEGER NOT NULL,
    auditorium_id       INTEGER NOT NULL,
    FOREIGN KEY (speaker_id) REFERENCES speakers (id),
    FOREIGN KEY (auditorium_id) REFERENCES auditoriums (id)
);

CREATE TABLE viewers
(
    id           SERIAL PRIMARY KEY,
    first_name   VARCHAR(255),
    phone_number INTEGER,
    email        VARCHAR(255)
);

CREATE TABLE speaker_roles
(
    speaker_id INTEGER NOT NULL,
    role_id    INTEGER NOT NULL,
    PRIMARY KEY (speaker_id, role_id),
    FOREIGN KEY (speaker_id) REFERENCES speakers (id),
    FOREIGN KEY (role_id) REFERENCES roles (id)
);

CREATE TABLE report_viewers
(
    report_id INTEGER NOT NULL,
    viewer_id INTEGER NOT NULL,
    PRIMARY KEY (report_id, viewer_id),
    FOREIGN KEY (report_id) REFERENCES reports (id),
    FOREIGN KEY (viewer_id) REFERENCES viewers (id)
);