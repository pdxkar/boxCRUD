package com.kroot.crudApp;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="BOX")
public class Box {

    @Id
    @Column(name="BOX_ID")
    @GeneratedValue
    private Long boxId;

    @Column(name="BOXTYPE")
    private String boxType;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="BOX_ATTRIBUTE",
            joinColumns={@JoinColumn(name="BOX_ID")},
            inverseJoinColumns={@JoinColumn(name="ATTRIBUTE_ID")})
    private Set<Attribute> attributes = new HashSet<Attribute>();

    public Box() {
    }

    public Box(String boxType) {
        this.boxType = boxType;
    }

    // Getter and Setter methods
    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setMeetings(Set<Attribute> attributes) {
        this.attributes = attributes;
    }
}