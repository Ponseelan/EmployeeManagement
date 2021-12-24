package com.employeeManagement.Repository;

import com.employeeManagement.Model.Counter;
import com.employeeManagement.Model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface CounterRepository extends JpaRepository<Counter, Integer> {

    @Transactional
    @Modifying
    @Query("update Counter ear set value=value+1 where  module = :module")
    int getNextValue(Module module);
}
