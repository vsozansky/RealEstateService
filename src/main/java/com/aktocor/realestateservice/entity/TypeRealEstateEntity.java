package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reo_type")
public class TypeRealEstateEntity {
    @Id
    @Column(name = "id_type", nullable = false)
    private int idType;

    @Basic
    @Column(name = "delete", nullable = false)
    private Boolean delete;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public TypeRealEstateEntity() {
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeRealEstateEntity that = (TypeRealEstateEntity) o;
        return idType == that.idType &&
                Objects.equals(delete, that.delete) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, delete, active);
    }

    @Override
    public String toString() {
        return "TypeRealEstateEntity{" +
                "idType=" + idType +
                ", delete=" + delete +
                ", active=" + active +
                '}';
    }
}
