package DMS.Employee.Tracker.service;

import DMS.Employee.Tracker.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee employee);
    void deleteEmployeeById(Long id);
}
