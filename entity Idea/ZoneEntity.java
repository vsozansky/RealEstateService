package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "zone", schema = "ps1761", catalog = "")
public class ZoneEntity {
    private int idZone;
    private String name;
    private byte active;

    @Id
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
        ZoneEntity that = (ZoneEntity) o;
        return idZone == that.idZone &&
                active == that.active &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZone, name, active);
    }
}
