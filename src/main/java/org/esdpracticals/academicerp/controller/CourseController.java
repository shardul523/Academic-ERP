package org.esdpracticals.academicerp.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.esdpracticals.academicerp.config.Role;
import org.esdpracticals.academicerp.dto.StudentDetailsDTO;
import org.esdpracticals.academicerp.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/{courseCode}/students")
    public ResponseEntity<List<StudentDetailsDTO>> getCourseStudents(
            HttpServletRequest request,
            @PathVariable("courseCode") String courseCode) {
        String role = request.getAttribute("role").toString();
        System.out.println(role);
        if (role == null || !role.equals(Role.EMPLOYEE)) {
            throw new AccessDeniedException("You do not have permission to access this resource");
        }
        return ResponseEntity.ok(courseService.getCourseStudents(courseCode));
    }
}
