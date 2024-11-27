ALTER TABLE Course_Schedule
ADD CONSTRAINT fk_course_schedule
FOREIGN KEY (course_id)
REFERENCES Courses(course_id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE Students
ADD CONSTRAINT fk_student_specialisation
FOREIGN KEY (specialisation)
REFERENCES Specialisation(specialisation_id)
ON DELETE SET NULL;

ALTER TABLE Faculty_Courses
ADD CONSTRAINT fk_faculty
FOREIGN KEY (faculty)
REFERENCES Employees(employee_id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE Faculty_Courses
ADD CONSTRAINT fk_courses
FOREIGN KEY (course_id)
REFERENCES Courses(course_id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE Specialisation_Course
ADD CONSTRAINT fk_specialisation
FOREIGN KEY (specialisation_id)
REFERENCES Specialisation(specialisation_id)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE Specialisation_Course
ADD CONSTRAINT fk_course
FOREIGN KEY (course_id)
REFERENCES Courses(course_id)
ON DELETE CASCADE
ON UPDATE CASCADE;