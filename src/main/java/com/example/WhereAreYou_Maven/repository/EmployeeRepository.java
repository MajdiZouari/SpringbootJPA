package com.example.WhereAreYou_Maven.repository;

import com.example.WhereAreYou_Maven.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findOneById(long id);
    public List<Employee> findAll();
}
