package com.leadsquared.employeeManagement.Repository;

import com.leadsquared.employeeManagement.Model.EmployeeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDepartmentRepository extends JpaRepository<EmployeeDepartment,Integer> {
}
