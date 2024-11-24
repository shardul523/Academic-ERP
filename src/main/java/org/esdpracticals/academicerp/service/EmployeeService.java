package org.esdpracticals.academicerp.service;

import lombok.RequiredArgsConstructor;
import org.esdpracticals.academicerp.dto.LoginRequest;
import org.esdpracticals.academicerp.dto.LoginResponse;
import org.esdpracticals.academicerp.entity.Employee;
import org.esdpracticals.academicerp.jwt.JwtHelper;
import org.esdpracticals.academicerp.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final JwtHelper jwtHelper;
    private final EmployeeRepository employeeRepository;
    private final EncryptionService encryptionService;

    public LoginResponse login(LoginRequest loginRequest) {
        String email = loginRequest.email();
        String password = loginRequest.password();
        Employee employee = employeeRepository.findByEmail(email);

        if (employee == null || !encryptionService.verifyPassword(password, employee.getPassword())) {
            return new LoginResponse(false, "Invalid email or password", null);
        }

        String token = jwtHelper.generateToken("FACULTY", employee.getEmployeeId());

        return new LoginResponse(true, "Authenticated", token);
    }
}
