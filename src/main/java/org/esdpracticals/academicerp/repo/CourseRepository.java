package org.esdpracticals.academicerp.repo;

import org.esdpracticals.academicerp.entity.Course;
import org.esdpracticals.academicerp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT s FROM Course c " +
            "LEFT JOIN StudentCourse sc " +
            "ON c.courseId = sc.course.courseId " +
            "LEFT JOIN Student s " +
            "ON s.studentId = sc.student.studentId " +
            "WHERE c.courseCode = :courseCode")
    List<Student> findStudentsByCourseCode(@Param("courseCode") String courseCode);
}
