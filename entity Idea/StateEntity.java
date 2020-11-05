package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "state", schema = "ps1761", catalog = "")
public class StateEntity {
    private int idState;
    private int idCountry;
    private int idZone;
    private String name;
    private String isoCode;
    private short taxBehavior;
    private byte active;

    @Id
    @Column(name = "id_state", nullable = false)
    public int getIdState() {
        return idState;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }

    @Basic
    @Column(name = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Basic
    @Column(name = "id_zone", nullable = false)
    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "iso_code", nullable = false, length = 7)
    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @Basic
    @Column(name = "tax_behavior", nullable = false)
    public short getTaxBehavior() {
        return taxBehavior;
    }

    public void setTaxBehavior(short taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    @Basic
    @Column(name = "active", nullable = false)
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateEntity that = (StateEntity) o;
        return idState == that.idState &&
                idCountry == that.idCountry &&
                idZone == that.idZone &&
                taxBehavior == that.taxBehavior &&
                active == that.active &&
                Objects.equals(name, that.name) &&
                Objects.equals(isoCode, that.isoCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idState, idCountry, idZone, name, isoCode, taxBehavior, active);
    }
}
