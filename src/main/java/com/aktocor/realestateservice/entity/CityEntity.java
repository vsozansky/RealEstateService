package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    @Column(name = "id_city", nullable = false)
    private Integer idCity;

    @Basic
    @Column(name = "id_country", nullable = false)
    private Integer idCountry;

    @Basic
    @Column(name = "id_state", nullable = false)
    private Integer idState;

    @Basic
    @Column(name = "delete", nullable = false)
    private Boolean delete;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public CityEntity() {
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
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
        CityEntity that = (CityEntity) o;
        return Objects.equals(idCity, that.idCity) &&
                Objects.equals(idCountry, that.idCountry) &&
                Objects.equals(idState, that.idState) &&
                Objects.equals(delete, that.delete) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCity, idCountry, idState, delete, active);
    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "idCity=" + idCity +
                ", idCountry=" + idCountry +
                ", idState=" + idState +
                ", delete=" + delete +
                ", active=" + active +
                '}';
    }
}
