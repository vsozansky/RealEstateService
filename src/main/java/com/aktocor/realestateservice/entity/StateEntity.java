package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "state")
public class StateEntity {
    @Id
    @Column(name = "id_state", nullable = false)
    private Integer idState;

    @Basic
    @Column(name = "id_country", nullable = false)
    private Integer idCountry;

    @Basic
    @Column(name = "id_zone", nullable = false)
    private Integer idZone;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Basic
    @Column(name = "iso_code", nullable = false, length = 7)
    private String isoCode;

    @Basic
    @Column(name = "tax_behavior", nullable = false)
    private short taxBehavior;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public StateEntity() {
    }

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public short getTaxBehavior() {
        return taxBehavior;
    }

    public void setTaxBehavior(short taxBehavior) {
        this.taxBehavior = taxBehavior;
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
        StateEntity that = (StateEntity) o;
        return taxBehavior == that.taxBehavior &&
                Objects.equals(idState, that.idState) &&
                Objects.equals(idCountry, that.idCountry) &&
                Objects.equals(idZone, that.idZone) &&
                Objects.equals(name, that.name) &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idState, idCountry, idZone, name, isoCode, taxBehavior, active);
    }

    @Override
    public String toString() {
        return "StateEntity{" +
                "idState=" + idState +
                ", idCountry=" + idCountry +
                ", idZone=" + idZone +
                ", name='" + name + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", taxBehavior=" + taxBehavior +
                ", active=" + active +
                '}';
    }
}
