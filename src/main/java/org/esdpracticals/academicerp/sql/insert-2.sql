INSERT INTO Course_Schedule (course_id, time, "day", room, building)
VALUES
    (1, '10:00 AM - 11:30 AM', 'Monday', 'Room 101', 'AI Building'),
    (2, '02:00 PM - 03:30 PM', 'Tuesday', 'Room 102', 'AI Building'),
    (3, '11:00 AM - 12:30 PM', 'Wednesday', 'Room 103', 'AI Building'),
    (4, '03:00 PM - 04:30 PM', 'Thursday', 'Room 104', 'AI Building'),
    (5, '09:00 AM - 10:30 AM', 'Monday', 'Room 201', 'Data Science Hall'),
    (6, '01:00 PM - 02:30 PM', 'Tuesday', 'Room 202', 'Data Science Hall'),
    (7, '11:00 AM - 12:30 PM', 'Wednesday', 'Room 203', 'Data Science Hall'),
    (8, '04:00 PM - 05:30 PM', 'Thursday', 'Room 204', 'Data Science Hall'),
    (9, '08:00 AM - 09:30 AM', 'Monday', 'Room 301', 'Cybersecurity Center'),
    (10, '12:00 PM - 01:30 PM', 'Tuesday', 'Room 302', 'Cybersecurity Center'),
    (11, '02:00 PM - 03:30 PM', 'Wednesday', 'Room 303', 'Cybersecurity Center'),
    (12, '04:00 PM - 05:30 PM', 'Thursday', 'Room 304', 'Cybersecurity Center');

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