package com.example.WhereAreYou_Maven.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Unity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              uniId;
    private String            name;

    @OneToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "uni_id")
    private Set<Employee> employee         = new HashSet<>();

    public long getUniId() {
        return uniId;
    }

    public void setUniId(long uniId) {
        this.uniId = uniId;
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