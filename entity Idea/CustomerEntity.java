package com.jprestashop.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "ps1761", catalog = "")
public class CustomerEntity {
    private int idCustomer;
    private int idShopGroup;
    private int idShop;
    private int idGender;
    private int idDefaultGroup;
    private Integer idLang;
    private int idRisk;
    private String company;
    private String siret;
    private String ape;
    private String firstname;
    private String lastname;
    private String email;
    private String passwd;
    private Timestamp lastPasswdGen;
    private Date birthday;
    private byte newsletter;
    private String ipRegistrationNewsletter;
    private Timestamp newsletterDateAdd;
    private byte optin;
    private String website;
    private BigDecimal outstandingAllowAmount;
    private byte showPublicPrices;
    private int maxPaymentDays;
    private String secureKey;
    private String note;
    private byte active;
    private byte isGuest;
    private byte deleted;
    private Timestamp dateAdd;
    private Timestamp dateUpd;
    private String resetPasswordToken;
    private Timestamp resetPasswordValidity;

    @Id
    @Column(name = "id_customer", nullable = false)
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Basic
    @Column(name = "id_shop_group", nullable = false)
    public int getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(int idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    @Basic
    @Column(name = "id_shop", nullable = false)
    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    @Basic
    @Column(name = "id_gender", nullable = false)
    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    @Basic
    @Column(name = "id_default_group", nullable = false)
    public int getIdDefaultGroup() {
        return idDefaultGroup;
    }

    public void setIdDefaultGroup(int idDefaultGroup) {
        this.idDefaultGroup = idDefaultGroup;
    }

    @Basic
    @Column(name = "id_lang", nullable = true)
    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    @Basic
    @Column(name = "id_risk", nullable = false)
    public int getIdRisk() {
        return idRisk;
    }

    public void setIdRisk(int idRisk) {
        this.idRisk = idRisk;
    }

    @Basic
    @Column(name = "company", nullable = true, length = 255)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "siret", nullable = true, length = 14)
    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    @Basic
    @Column(name = "ape", nullable = true, length = 5)
    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    @Basic
    @Column(name = "firstname", nullable = false, length = 255)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname", nullable = false, length = 255)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "passwd", nullable = false, length = 255)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "last_passwd_gen", nullable = false)
    public Timestamp getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(Timestamp lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "newsletter", nullable = false)
    public byte getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(byte newsletter) {
        this.newsletter = newsletter;
    }

    @Basic
    @Column(name = "ip_registration_newsletter", nullable = true, length = 15)
    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    @Basic
    @Column(name = "newsletter_date_add", nullable = true)
    public Timestamp getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(Timestamp newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    @Basic
    @Column(name = "optin", nullable = false)
    public byte getOptin() {
        return optin;
    }

    public void setOptin(byte optin) {
        this.optin = optin;
    }

    @Basic
    @Column(name = "website", nullable = true, length = 128)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "outstanding_allow_amount", nullable = false, precision = 6)
    public BigDecimal getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }

    public void setOutstandingAllowAmount(BigDecimal outstandingAllowAmount) {
        this.outstandingAllowAmount = outstandingAllowAmount;
    }

    @Basic
    @Column(name = "show_public_prices", nullable = false)
    public byte getShowPublicPrices() {
        return showPublicPrices;
    }

    public void setShowPublicPrices(byte showPublicPrices) {
        this.showPublicPrices = showPublicPrices;
    }

    @Basic
    @Column(name = "max_payment_days", nullable = false)
    public int getMaxPaymentDays() {
        return maxPaymentDays;
    }

    public void setMaxPaymentDays(int maxPaymentDays) {
        this.maxPaymentDays = maxPaymentDays;
    }

    @Basic
    @Column(name = "secure_key", nullable = false, length = 32)
    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    @Basic
    @Column(name = "note", nullable = true, length = -1)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "is_guest", nullable = false)
    public byte getIsGuest() {
        return isGuest;
    }

    public void setIsGuest(byte isGuest) {
        this.isGuest = isGuest;
    }

    @Basic
    @Column(name = "deleted", nullable = false)
    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "date_add", nullable = false)
    public Timestamp getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Timestamp dateAdd) {
        this.dateAdd = dateAdd;
    }

    @Basic
    @Column(name = "date_upd", nullable = false)
    public Timestamp getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(Timestamp dateUpd) {
        this.dateUpd = dateUpd;
    }

    @Basic
    @Column(name = "reset_password_token", nullable = true, length = 40)
    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    @Basic
    @Column(name = "reset_password_validity", nullable = true)
    public Timestamp getResetPasswordValidity() {
        return resetPasswordValidity;
    }

    public void setResetPasswordValidity(Timestamp resetPasswordValidity) {
        this.resetPasswordValidity = resetPasswordValidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return idCustomer == that.idCustomer &&
                idShopGroup == that.idShopGroup &&
                idShop == that.idShop &&
                idGender == that.idGender &&
                idDefaultGroup == that.idDefaultGroup &&
                idRisk == that.idRisk &&
                newsletter == that.newsletter &&
                optin == that.optin &&
                showPublicPrices == that.showPublicPrices &&
                maxPaymentDays == that.maxPaymentDays &&
                active == that.active &&
                isGuest == that.isGuest &&
                deleted == that.deleted &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(company, that.company) &&
                Objects.equals(siret, that.siret) &&
                Objects.equals(ape, that.ape) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(email, that.email) &&
                Objects.equals(passwd, that.passwd) &&
                Objects.equals(lastPasswdGen, that.lastPasswdGen) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(ipRegistrationNewsletter, that.ipRegistrationNewsletter) &&
                Objects.equals(newsletterDateAdd, that.newsletterDateAdd) &&
                Objects.equals(website, that.website) &&
                Objects.equals(outstandingAllowAmount, that.outstandingAllowAmount) &&
                Objects.equals(secureKey, that.secureKey) &&
                Objects.equals(note, that.note) &&
                Objects.equals(dateAdd, that.dateAdd) &&
                Objects.equals(dateUpd, that.dateUpd) &&
                Objects.equals(resetPasswordToken, that.resetPasswordToken) &&
                Objects.equals(resetPasswordValidity, that.resetPasswordValidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCustomer, idShopGroup, idShop, idGender, idDefaultGroup, idLang, idRisk, company, siret, ape, firstname, lastname, email, passwd, lastPasswdGen, birthday, newsletter, ipRegistrationNewsletter, newsletterDateAdd, optin, website, outstandingAllowAmount, showPublicPrices, maxPaymentDays, secureKey, note, active, isGuest, deleted, dateAdd, dateUpd, resetPasswordToken, resetPasswordValidity);
    }
}
