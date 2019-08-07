package com.marcotechnology.baac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcotechnology.baac.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
