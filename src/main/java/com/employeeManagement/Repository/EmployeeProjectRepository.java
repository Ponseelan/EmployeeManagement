package com.employeeManagement.Repository;

import com.employeeManagement.Model.EmployeeProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject,Integer> {
    @Modifying
    @Transactional
    @Query("update EmployeeProject ear set isActive=false where  employeeId = :employeeId AND  projectId = :projectId")
    int dissociateProject(int employeeId, int projectId);
}
