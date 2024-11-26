package org.esdpracticals.academicerp.repo;

import org.esdpracticals.academicerp.dto.FacultyCourseScheduleResponse;
import org.esdpracticals.academicerp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmail(String email);
    @Query("SELECT new org.esdpracticals.academicerp.dto.FacultyCourseScheduleResponse(cs, s.name) " +
            "FROM " +
            "Employee e LEFT JOIN FacultyCourse f " +
            "ON e.employeeId = f.faculty.employeeId " +
            "LEFT JOIN Course c " +
            "ON f.course.courseId = c.courseId " +
            "LEFT JOIN CourseSchedule cs " +
            "ON c.courseId = cs.course.courseId " +
            "LEFT JOIN SpecialisationCourse sc " +
            "ON sc.course.courseId = c.courseId " +
            "LEFT JOIN Specialisation s " +
            "ON s.specialisationId = sc.specialisation.specialisationId " +
            "WHERE e.employeeId = :employeeId")
    List<FacultyCourseScheduleResponse> findCoursesByEmpId(@Param("employeeId") Long employeeId);
}
