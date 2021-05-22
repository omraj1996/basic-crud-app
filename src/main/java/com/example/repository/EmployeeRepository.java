package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Employee;


public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
