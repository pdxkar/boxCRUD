package com.kroot.crudApp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="BOX")
public class Box {

    @Id
    @Column(name="BOX_ID")
    @GeneratedValue
    private Long boxId;

    @Column(name="BOXTYPE")
    private String boxType;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
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

    public static Builder getBuilder(String boxType, Set<Attribute> attributes){   return new Builder(boxType, attributes); }

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
        Builder(String boxType, Set<Attribute> attributes) {
            built = new Box();
            built.boxType = boxType;
            built.attributes = attributes;

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

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes (Set<Attribute> attributes) {
        this.attributes = attributes;
    }
}