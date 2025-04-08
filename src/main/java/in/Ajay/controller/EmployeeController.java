package in.Ajay.controller;
import in.Ajay.entity.Employee;
import in.Ajay.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/bulk-insert")
    public String bulkInsert(@RequestBody List<Employee> employeeList) {
        employeeService.insertBulkEmployees(employeeList);
        return "Bulk data inserted successfully!";
    }
}
