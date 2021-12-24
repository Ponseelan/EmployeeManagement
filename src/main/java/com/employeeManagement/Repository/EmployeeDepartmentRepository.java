package com.employeeManagement.Repository;

import com.employeeManagement.Model.EmployeeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDepartmentRepository extends JpaRepository<EmployeeDepartment,Integer> {
}
