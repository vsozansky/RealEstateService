package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lang", schema = "ps1761", catalog = "")
public class LangEntity {
    private int idLang;
    private String name;
    private byte active;
    private String isoCode;
    private String languageCode;
    private String locale;
    private String dateFormatLite;
    private String dateFormatFull;
    private byte isRtl;

    @Id
    @Column(name = "id_lang", nullable = false)
    public int getIdLang() {
        return idLang;
    }

    public void setIdLang(int idLang) {
        this.idLang = idLang;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 32)
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

    @Basic
    @Column(name = "iso_code", nullable = false, length = 2)
    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @Basic
    @Column(name = "language_code", nullable = false, length = 5)
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Basic
    @Column(name = "locale", nullable = false, length = 5)
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Basic
    @Column(name = "date_format_lite", nullable = false, length = 32)
    public String getDateFormatLite() {
        return dateFormatLite;
    }

    public void setDateFormatLite(String dateFormatLite) {
        this.dateFormatLite = dateFormatLite;
    }

    @Basic
    @Column(name = "date_format_full", nullable = false, length = 32)
    public String getDateFormatFull() {
        return dateFormatFull;
    }

    public void setDateFormatFull(String dateFormatFull) {
        this.dateFormatFull = dateFormatFull;
    }

    @Basic
    @Column(name = "is_rtl", nullable = false)
    public byte getIsRtl() {
        return isRtl;
    }

    public void setIsRtl(byte isRtl) {
        this.isRtl = isRtl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LangEntity that = (LangEntity) o;
        return idLang == that.idLang &&
                active == that.active &&
                isRtl == that.isRtl &&
                Objects.equals(name, that.name) &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(languageCode, that.languageCode) &&
                Objects.equals(locale, that.locale) &&
                Objects.equals(dateFormatLite, that.dateFormatLite) &&
                Objects.equals(dateFormatFull, that.dateFormatFull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLang, name, active, isoCode, languageCode, locale, dateFormatLite, dateFormatFull, isRtl);
    }
}
