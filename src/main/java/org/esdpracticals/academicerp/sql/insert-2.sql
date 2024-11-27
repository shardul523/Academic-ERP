INSERT INTO Course_Schedule (course_id, `time`, day, room, building)
VALUES
    (1, 2, 1, 'Room 101', 'AI Building'),
    (2, 4, 2, 'Room 102', 'AI Building'),
    (3, 3, 3, 'Room 103', 'AI Building'),
    (4, 5, 4, 'Room 104', 'AI Building'),
    (5, 1, 1, 'Room 201', 'Data Science Hall'),
    (6, 4, 2, 'Room 202', 'Data Science Hall'),
    (7, 3, 3, 'Room 203', 'Data Science Hall'),
    (8, 5, 4, 'Room 204', 'Data Science Hall'),
    (9, 1, 1, 'Room 301', 'Cybersecurity Center'),
    (10, 3, 2, 'Room 302', 'Cybersecurity Center'),
    (11, 4, 3, 'Room 303', 'Cybersecurity Center'),
    (12, 5, 4, 'Room 304', 'Cybersecurity Center');

INSERT INTO Faculty_Courses (faculty, course_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6),
    (7, 7),
    (8, 8),
    (9, 9),
    (10, 10),
    (1, 11),
    (2, 12);

INSERT INTO Specialisation_Course (specialisation_id, course_id)
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (1, 4),
    (2, 5),
    (2, 6),
    (2, 8),
    (2, 7),
    (3, 9),
    (3, 10),
    (3, 11),
    (3, 12);

INSERT INTO Student_Courses (student_id, course_id)
VALUES
    (1, 1),
    (2, 1),
    (3, 1);