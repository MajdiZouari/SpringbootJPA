package com.example.WhereAreYou_Maven.repository;

import com.example.WhereAreYou_Maven.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee getOne(Long id);
    public List<Employee> findAll();
}
