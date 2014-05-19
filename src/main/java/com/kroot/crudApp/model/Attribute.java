package com.kroot.crudApp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ATTRIBUTE")
public class Attribute {

    @Id
    @Column(name="ATTRIBUTE_ID")
    @GeneratedValue
    private Long attributeId;

    @Column(name="ATTRIBUTE")
    private String attribute;

    @ManyToMany(mappedBy="attributes")
    private Set<Box> boxes = new HashSet<Box>();

    public Attribute(String attribute) {
        this.attribute = attribute;
    }

    // Getter and Setter methods
    public Set<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(Set<Box> boxes) {
        this.boxes = boxes;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

}