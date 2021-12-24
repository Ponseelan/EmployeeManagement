package com.leadsquared.employeeManagement.Repository;

import com.leadsquared.employeeManagement.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
