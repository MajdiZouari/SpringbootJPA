package com.example.WhereAreYou_Maven.services;

import com.example.WhereAreYou_Maven.model.Employee;
import com.example.WhereAreYou_Maven.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long id){
        return employeeRepository.getOne(id);
    }

    public void deleteEmployeeById(long id){
        employeeRepository.deleteById(id);
    }

    public void updateEmployee(Employee employee){
        employeeRepository.findById(employee.getEmpId())
                .map(emp -> {
                    emp.setName(employee.getName());
                    emp.setDesk(employee.getDesk());
                    emp.setMaterial(employee.getMaterial());
                    return employeeRepository.save(emp);
                });
    }


    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
}
