package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @Column(name = "id_address", nullable = false)
    private Integer idAddress;

    @Basic
    @Column(name = "id_city", nullable = false)
    private Integer idCity;

    @Basic
    @Column(name = "id_street", nullable = false)
    private Integer idStreet;

    @Basic
    @Column(name = "identifier", nullable = false, length = 64)
    private String Identifier;

    @Basic
    @Column(name = "id_location", nullable = false)
    private Long idLocation;

    @Basic
    @Column(name = "delete", nullable = false)
    private Boolean delete;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public AddressEntity() {
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public Integer getIdStreet() {
        return idStreet;
    }

    public void setIdStreet(Integer idStreet) {
        this.idStreet = idStreet;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
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
        AddressEntity that = (AddressEntity) o;
        return Objects.equals(idAddress, that.idAddress) &&
                Objects.equals(idCity, that.idCity) &&
                Objects.equals(idStreet, that.idStreet) &&
                Objects.equals(Identifier, that.Identifier) &&
                Objects.equals(idLocation, that.idLocation) &&
                Objects.equals(delete, that.delete) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAddress, idCity, idStreet, Identifier, idLocation, delete, active);
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "idAddress=" + idAddress +
                ", idCity=" + idCity +
                ", idStreet=" + idStreet +
                ", Identifier='" + Identifier + '\'' +
                ", idLocation=" + idLocation +
                ", delete=" + delete +
                ", active=" + active +
                '}';
    }
}
