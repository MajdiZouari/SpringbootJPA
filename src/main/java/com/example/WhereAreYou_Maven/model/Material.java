package com.example.WhereAreYou_Maven.model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              matId;

    private String            name;

    public long getMatId() {
        return matId;
    }

    public void setMatId(long matId) {
        this.matId = matId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}