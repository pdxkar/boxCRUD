package com.kroot.crudApp.model;

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

    public Long getId() {
        return boxId;
    }

    public void update(String boxType){
        this.boxType = boxType;
    }

    /*Gets a Builder which is used to create a Box object */
    public static Builder getBuilder(String boxType){
        return new Builder(boxType);
    }

    public String getBoxType() {
        return boxType;
    }

    /**
     * A Builder class used to create new Box objects.
     */
    public static class Builder {
        Box built;

        /**
         * Creates a new Builder instance.
         * @param boxType The type of the created Box object.
         */
        Builder(String boxType) {
            built = new Box();
            built.boxType = boxType;

        }

        /**
         * Builds the new Box object.
         * @return  The created Box object.
         */
        public Box build() {
            return built;
        }
    }



    // Getter and Setter methods
    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

//    public String getBoxType() {
//        return boxType;
//    }

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