package in.Ajay.repository;

import in.Ajay.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveAll(List<Employee> employees) {
        String sql = "INSERT INTO employee (name, email, age) VALUES (?, ?, ?)";

        jdbcTemplate.batchUpdate(sql,
                employees,
                employees.size(),
                (ps, employee) -> {
                    ps.setString(1, employee.getName());
                    ps.setString(2, employee.getEmail());
                    ps.setInt(3,employee.getAge());
                });
    }
}
