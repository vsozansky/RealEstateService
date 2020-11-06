package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "state_lang")
@IdClass(StateLangEntityPK.class)
public class StateLangEntity {
    @Id
    @Column(name = "id_state", nullable = false)
    private Integer idState;

    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public StateLangEntity() {
    }

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
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
        StateLangEntity that = (StateLangEntity) o;
        return Objects.equals(idState, that.idState) &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idState, idLang, name);
    }

    @Override
    public String toString() {
        return "StateLangEntity{" +
                "idState=" + idState +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                '}';
    }
}
