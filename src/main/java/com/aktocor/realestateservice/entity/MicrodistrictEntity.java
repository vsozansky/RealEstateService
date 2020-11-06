package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "microdistrict")
public class MicrodistrictEntity {
    @Id
    @Column(name = "id_microdistrict", nullable = false)
    private Integer idMicrodistrict;

    @Basic
    @Column(name = "id_city", nullable = false)
    private Integer idCity;

    @Basic
    @Column(name = "delete", nullable = false)
    private Boolean delete;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public MicrodistrictEntity() {
    }


    public Integer getIdMicrodistrict() {
        return idMicrodistrict;
    }

    public void setIdMicrodistrict(Integer idMicrodistrict) {
        this.idMicrodistrict = idMicrodistrict;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
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
        MicrodistrictEntity that = (MicrodistrictEntity) o;
        return Objects.equals(idMicrodistrict, that.idMicrodistrict) &&
                Objects.equals(idCity, that.idCity) &&
                Objects.equals(delete, that.delete) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMicrodistrict, idCity, delete, active);
    }

    @Override
    public String toString() {
        return "MicrodistrictEntity{" +
                "idMicrodistrict=" + idMicrodistrict +
                ", idCity=" + idCity +
                ", delete=" + delete +
                ", active=" + active +
                '}';
    }
}
