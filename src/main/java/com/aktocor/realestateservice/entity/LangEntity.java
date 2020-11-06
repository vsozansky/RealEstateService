package com.aktocor.realestateservice.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lang")
public class LangEntity {
    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    @Basic
    @Column(name = "iso_code", nullable = false, length = 2)
    private String isoCode;

    @Basic
    @Column(name = "language_code", nullable = false, length = 5)
    private String languageCode;

    @Basic
    @Column(name = "locale", nullable = false, length = 5)
    private String locale;

    @Basic
    @Column(name = "date_format_lite", nullable = false, length = 32)
    private String dateFormatLite;

    @Basic
    @Column(name = "date_format_full", nullable = false, length = 32)
    private String dateFormatFull;

    @Basic
    @Column(name = "is_rtl", nullable = false)
    private Boolean isRtl;

    public LangEntity() {
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getDateFormatLite() {
        return dateFormatLite;
    }

    public void setDateFormatLite(String dateFormatLite) {
        this.dateFormatLite = dateFormatLite;
    }

    public String getDateFormatFull() {
        return dateFormatFull;
    }

    public void setDateFormatFull(String dateFormatFull) {
        this.dateFormatFull = dateFormatFull;
    }

    public Boolean getIsRtl() {
        return isRtl;
    }

    public void setIsRtl(Boolean isRtl) {
        this.isRtl = isRtl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LangEntity that = (LangEntity) o;
        return Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name) &&
                Objects.equals(active, that.active) &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(languageCode, that.languageCode) &&
                Objects.equals(locale, that.locale) &&
                Objects.equals(dateFormatLite, that.dateFormatLite) &&
                Objects.equals(dateFormatFull, that.dateFormatFull) &&
                Objects.equals(isRtl, that.isRtl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLang, name, active, isoCode, languageCode, locale, dateFormatLite, dateFormatFull, isRtl);
    }

    @Override
    public String toString() {
        return "LangEntity{" +
                "idLang=" + idLang +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", isoCode='" + isoCode + '\'' +
                ", languageCode='" + languageCode + '\'' +
                ", locale='" + locale + '\'' +
                ", dateFormatLite='" + dateFormatLite + '\'' +
                ", dateFormatFull='" + dateFormatFull + '\'' +
                ", isRtl=" + isRtl +
                '}';
    }
}
