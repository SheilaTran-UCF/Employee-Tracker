package DMS.Employee.Tracker.service;

import DMS.Employee.Tracker.model.Employee;
import DMS.Employee.Tracker.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        repository.deleteById(id);
    }
}
