CREATE TABLE Courses (
    course_id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_code VARCHAR(255) NOT NULL UNIQUE,
    name        VARCHAR(255),
    description TEXT,
    `year`      INT,
    term        VARCHAR(50),
    faculty     VARCHAR(100),
    credits     INT,
    capacity    INT
);

CREATE TABLE Course_Schedule (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_id   BIGINT NOT NULL UNIQUE,
    `time`      INT NOT NULL,
    day       INT NOT NULL,
    room        VARCHAR(255),
    building    VARCHAR(255),
    CONSTRAINT check_time CHECK ( time BETWEEN 1 AND 5 ),
    CONSTRAINT check_day CHECK ( day BETWEEN 1 AND 7 )
);

CREATE TABLE Employees (
    employee_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    title VARCHAR(30),
    photograph_path VARCHAR(255)
);

CREATE TABLE Faculty_Courses (
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY,
    faculty             BIGINT NOT NULL,
    course_id           BIGINT NOT NULL,
    CONSTRAINT unique_row UNIQUE (faculty, course_id)
);

CREATE TABLE Specialisation (
    specialisation_id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    code                VARCHAR(255) NOT NULL UNIQUE,
    name                VARCHAR(255),
    description         TEXT,
    `year`              INT,
    credits_required    INT
);

CREATE TABLE Specialisation_Course (
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY,
    specialisation_id   BIGINT NOT NULL,
    course_id           BIGINT NOT NULL,
    CONSTRAINT unique_row UNIQUE (specialisation_id, course_id)
);

CREATE TABLE Students (
    student_id      BIGINT PRIMARY KEY AUTO_INCREMENT,
    roll_number     VARCHAR(255) NOT NULL UNIQUE,
    first_name      VARCHAR(255),
    last_name       VARCHAR(255),
    email           VARCHAR(255) NOT NULL UNIQUE,
    photograph_path VARCHAR(255),
    cgpa DOUBLE,
    total_credits   INT,
    `year`          INT,
    specialisation  BIGINT
);

CREATE TABLE Student_Courses (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id  BIGINT NOT NULl,
    course_id   BIGINT NOT NULL,
    CONSTRAINT unique_row UNIQUE (student_id, course_id)
);