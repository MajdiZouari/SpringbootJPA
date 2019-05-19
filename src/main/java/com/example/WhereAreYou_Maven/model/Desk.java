package com.example.WhereAreYou_Maven.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Desk implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              dskId;

    private int               dskNumber;

    @OneToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "dsk_id")
    private Set<Material> material;

    public long getDskId() {
        return dskId;
    }

    public void setDskId(long dskId) {
        this.dskId = dskId;
    }

    public int getDskNumber() {
        return dskNumber;
    }

    public void setDskNumber(int dskNumber) {
        this.dskNumber = dskNumber;
    }

    public Set<Material> getMaterial() {
        return material;
    }

    public void setMaterial(Set<Material> material) {
        this.material = material;
    }
}