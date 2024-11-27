package org.esdpracticals.academicerp.service;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.esdpracticals.academicerp.config.Role;
import org.esdpracticals.academicerp.dto.*;
import org.esdpracticals.academicerp.entity.Employee;
import org.esdpracticals.academicerp.jwt.JwtHelper;
import org.esdpracticals.academicerp.mapper.EmployeeMapper;
import org.esdpracticals.academicerp.repo.EmployeeRepository;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final JwtHelper jwtHelper;
    private final EmployeeRepository employeeRepository;
    private final EncryptionService encryptionService;
    private final EmployeeMapper employeeMapper;

    public LoginResponse login(LoginRequest loginRequest) {
        String email = loginRequest.email();
        String password = loginRequest.password();

        Employee employee = employeeRepository.findByEmail(email);

        if (employee == null || !encryptionService.verifyPassword(password, employee.getPassword())) {
            return new LoginResponse(false, "Invalid email or password", null);
        }

        String token = jwtHelper.generateToken(Role.EMPLOYEE, employee.getEmployeeId());

        return new LoginResponse(true, "Authenticated", token);
    }

    public List<FacultyCourseScheduleResponse> getEmployeeCourses(HttpServletRequest request) {
        String role = (String) request.getAttribute("role");
        if (!role.equals(Role.EMPLOYEE)) throw new AccessDeniedException("Access Denied");
        Long userId = (Long) request.getAttribute("userId");

        return employeeRepository.findCoursesByEmpId(userId);
    }

    public EmployeeDetailsResponse getEmployeeDetails(HttpServletRequest request) {
        String role = (String) request.getAttribute("role");
        if (!role.equals(Role.EMPLOYEE)) throw new AccessDeniedException("Access Denied");
        Long userId = (Long) request.getAttribute("userId");

        Employee employee = employeeRepository.findById(userId).orElse(null);

        if (employee == null) throw new AccessDeniedException("Access Denied");

        return employeeMapper.entityToResponse(employee);
    }
}
