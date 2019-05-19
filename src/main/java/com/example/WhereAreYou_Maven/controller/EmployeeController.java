package com.example.WhereAreYou_Maven.controller;

import com.example.WhereAreYou_Maven.model.Desk;
import com.example.WhereAreYou_Maven.model.Employee;
import com.example.WhereAreYou_Maven.repository.DeskRepository;
import com.example.WhereAreYou_Maven.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DeskRepository deskRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Employee> create(@RequestBody @Valid Employee employee, BindingResult result) {
        if (result.hasErrors())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Employee must have a name");
        employeeService.createEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }


    @GetMapping("/testAdd")
    public ResponseEntity<Employee> testAddEmployee(){
        Desk desk = new Desk();
        desk.setDskNumber(32);
        deskRepository.save(desk);

        Employee employee = new Employee();
        employee.setName("Anthony");
        employee.setDesk(desk);
        employeeService.createEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

}
