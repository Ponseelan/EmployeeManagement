package com.leadsquared.employeeManagement.Repository;

import com.leadsquared.employeeManagement.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
