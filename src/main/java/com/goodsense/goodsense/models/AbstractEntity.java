package com.goodsense.goodsense.models;
import javax.persistence.*;
import java.util.Objects;
//import javax.constraints.*;

@Entity
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

   // @NotBlank(message = "Name is required")
   // @Size(max = 200, message = "Name too long.")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEntity)) return false;
        AbstractEntity that = (AbstractEntity) o;
        return getId() == that.getId() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
