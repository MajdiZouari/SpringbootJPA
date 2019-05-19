package com.example.WhereAreYou_Maven.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              dskId;

    private int               dskNumber;

    @ManyToOne
    private GroupDesk groupDesk;

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

    public GroupDesk getGroupDesk() {
        return groupDesk;
    }

    public void setGroupDesk(GroupDesk groupDesk) {
        this.groupDesk = groupDesk;
    }

    public Set<Material> getMaterial() {
        return material;
    }

    public void setMaterial(Set<Material> material) {
        this.material = material;
    }
}