package com.example.WhereAreYou_Maven.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GroupDesk implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long              gdkId;

    private String            name;
    private String            floor;

    @OneToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "gdk_id")
    private Set<Desk> desks         = new HashSet<>();

    public long getGdkId() {
        return gdkId;
    }

    public void setGdkId(long gdkId) {
        this.gdkId = gdkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Set<Desk> getDesks() {
        return desks;
    }

    public void setDesks(Set<Desk> desks) {
        this.desks = desks;
    }
}