package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address_lang")
@IdClass(AddressLangEntityPK.class)
public class AddressLangEntity {
    @Id
    @Column(name = "id_address", nullable = false)
    private Integer idAddress;

    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public AddressLangEntity() {
    }

    public Integer getidAddress() {
        return idAddress;
    }

    public void setidAddress(Integer idStreet) {
        this.idAddress = idAddress;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressLangEntity that = (AddressLangEntity) o;
        return Objects.equals(idAddress, that.idAddress) &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAddress, idLang, name);
    }

    @Override
    public String toString() {
        return "AddressLangEntity{" +
                "idAddress=" + idAddress +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                '}';
    }
}
