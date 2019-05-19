package com.example.WhereAreYou_Maven.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MaterialType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              matTypeId;

    private String            name;

    @OneToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "mat_type_id")
    private Set<Material> material         = new HashSet<>();

    public long getMatTypeId() {
        return matTypeId;
    }

    public void setMatTypeId(long matTypeId) {
        this.matTypeId = matTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}