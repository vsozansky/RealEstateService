package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "zone")
public class ZoneEntity {
    @Id
    @Column(name = "id_zone", nullable = false)
    private int idZone;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public ZoneEntity() {
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        ZoneEntity that = (ZoneEntity) o;
        return idZone == that.idZone &&
                Objects.equals(name, that.name) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZone, name, active);
    }

    @Override
    public String toString() {
        return "ZoneEntity{" +
                "idZone=" + idZone +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
