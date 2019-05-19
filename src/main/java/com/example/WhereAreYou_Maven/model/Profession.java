package com.example.WhereAreYou_Maven.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Profession implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              prfId;

    private String            name;

    @OneToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "prf_id")
    private Set<Employee> employee         = new HashSet<>();

    public long getPrfId() {
        return prfId;
    }

    public void setPrfId(long prfId) {
        this.prfId = prfId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}