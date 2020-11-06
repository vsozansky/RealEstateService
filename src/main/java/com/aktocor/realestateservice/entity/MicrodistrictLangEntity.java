package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "microdistrict_lang")
@IdClass(MicrodistrictLangEntityPK.class)
public class MicrodistrictLangEntity {
    @Id
    @Column(name = "id_microdistrict", nullable = false)
    private Integer idMicrodistrict;

    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public MicrodistrictLangEntity() {
    }

    public Integer getIdMicrodistrict() {
        return idMicrodistrict;
    }

    public void setIdMicrodistrict(Integer idMicrodistrict) {
        this.idMicrodistrict = idMicrodistrict;
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
        MicrodistrictLangEntity that = (MicrodistrictLangEntity) o;
        return Objects.equals(idMicrodistrict, that.idMicrodistrict) &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMicrodistrict, idLang, name);
    }

    @Override
    public String toString() {
        return "MicrodistrictLangEntity{" +
                "idMicrodistrict=" + idMicrodistrict +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                '}';
    }
}
