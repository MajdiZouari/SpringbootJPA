package com.example.WhereAreYou_Maven.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              staId;

    private String            name;

    @OneToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "sta_id")
    private Set<Employee> employee         = new HashSet<>();

    public long getStaId() {
        return staId;
    }

    public void setStaId(long staId) {
        this.staId = staId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}