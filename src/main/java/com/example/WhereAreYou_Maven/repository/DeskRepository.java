package com.example.WhereAreYou_Maven.repository;

import com.example.WhereAreYou_Maven.model.Desk;
import com.example.WhereAreYou_Maven.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeskRepository extends JpaRepository<Desk, Long> {
}