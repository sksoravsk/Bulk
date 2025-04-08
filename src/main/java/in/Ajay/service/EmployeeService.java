package in.Ajay.service;

import in.Ajay.entity.Employee;
import in.Ajay.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void insertBulkEmployees(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }
}
