package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reo")
public class RealEstateObjectEntity {
    @Id
    @Column(name = "id_reo", nullable = false)
    private int idRealEstateObject;

    @Basic
    @Column(name = "id_address", nullable = false)
    private int idAddress;

    @Basic
    @Column(name = "id_type", nullable = false)
    private int idType;

    @Basic
    @Column(name = "delete", nullable = false)
    private Boolean delete;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public RealEstateObjectEntity() {
    }

    public int getIdRealEstateObject() {
        return idRealEstateObject;
    }

    public void setIdRealEstateObject(int idRealEstateObject) {
        this.idRealEstateObject = idRealEstateObject;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
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
        RealEstateObjectEntity that = (RealEstateObjectEntity) o;
        return idRealEstateObject == that.idRealEstateObject &&
                idAddress == that.idAddress &&
                idType == that.idType &&
                Objects.equals(delete, that.delete) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRealEstateObject, idAddress, idType, delete, active);
    }

    @Override
    public String toString() {
        return "RealEstateObjectEntity{" +
                "idRealEstateObject=" + idRealEstateObject +
                ", idAddress=" + idAddress +
                ", idType=" + idType +
                ", delete=" + delete +
                ", active=" + active +
                '}';
    }
}
