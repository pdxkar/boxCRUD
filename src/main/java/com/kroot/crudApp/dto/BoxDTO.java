package com.kroot.crudApp.dto;

        import com.kroot.crudApp.model.Attribute;
        import org.apache.commons.lang.builder.ToStringBuilder;
        import org.hibernate.validator.constraints.NotEmpty;

        import java.util.Set;

public class BoxDTO {

    private Long id;

    @NotEmpty
    private String boxType;

//    private String attribute;

    private Set<Attribute> attributes;

    public BoxDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

//    public String getAttribute() { return attribute; }
//
//    public void setAttribute(String attribute) { this.attribute = attribute; }

    public Set<Attribute> getAttributes() { return attributes; }

    public void setAttributes(Set<Attribute> attributes) { this.attributes = attributes; }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}