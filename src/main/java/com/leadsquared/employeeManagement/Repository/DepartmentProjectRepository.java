package com.leadsquared.employeeManagement.Repository;

import com.leadsquared.employeeManagement.Model.DepartmentProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentProjectRepository extends JpaRepository<DepartmentProject,Integer> {
}
