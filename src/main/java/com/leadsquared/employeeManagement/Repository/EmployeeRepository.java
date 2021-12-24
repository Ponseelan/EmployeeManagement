package com.leadsquared.employeeManagement.Repository;

import com.leadsquared.employeeManagement.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("SELECT DISTINCT e from Employee e join EmployeeProject ep on e.id=ep.employeeId AND ep.projectId= :projectId")
    List<Employee> getEmployeeByProject(int projectId);
}
