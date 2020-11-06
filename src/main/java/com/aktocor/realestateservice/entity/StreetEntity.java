package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "street")
public class StreetEntity {
    @Id
    @Column(name = "id_street", nullable = false)
    private Integer idStreet;

    @Basic
    @Column(name = "id_city", nullable = false)
    private Integer idCity;

    @Basic
    @Column(name = "id_microdistrict", nullable = false)
    private Integer idMicrodistrict;

    @Basic
    @Column(name = "delete", nullable = false)
    private Boolean delete;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public StreetEntity() {
    }

    public Integer getIdStreet() {
        return idStreet;
    }

    public void setIdStreet(Integer idStreet) {
        this.idStreet = idStreet;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public Integer getIdMicrodistrict() {
        return idMicrodistrict;
    }

    public void setIdMicrodistrict(Integer idMicrodistrict) {
        this.idMicrodistrict = idMicrodistrict;
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
        StreetEntity that = (StreetEntity) o;
        return Objects.equals(idStreet, that.idStreet) &&
                Objects.equals(idCity, that.idCity) &&
                Objects.equals(idMicrodistrict, that.idMicrodistrict) &&
                Objects.equals(delete, that.delete) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStreet, idCity, idMicrodistrict, delete, active);
    }

    @Override
    public String toString() {
        return "StreetEntity{" +
                "idStreet=" + idStreet +
                ", idCity=" + idCity +
                ", idMicrodistrict=" + idMicrodistrict +
                ", delete=" + delete +
                ", active=" + active +
                '}';
    }
}
