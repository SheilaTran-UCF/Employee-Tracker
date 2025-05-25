package DMS.Employee.Tracker.repository;

import DMS.Employee.Tracker.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JpaRepository gives basic CRUD out of the box
}
