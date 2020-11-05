package com.jprestashop.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "ps1761", catalog = "")
public class AddressEntity {
    private int idAddress;
    private int idCountry;
    private Integer idState;
    private int idCustomer;
    private int idManufacturer;
    private int idSupplier;
    private int idWarehouse;
    private String alias;
    private String company;
    private String lastname;
    private String firstname;
    private String address1;
    private String address2;
    private String postcode;
    private String city;
    private String other;
    private String phone;
    private String phoneMobile;
    private String vatNumber;
    private String dni;
    private Timestamp dateAdd;
    private Timestamp dateUpd;
    private byte active;
    private byte deleted;

    @Id
    @Column(name = "id_address", nullable = false)
    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
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
    @Column(name = "id_state", nullable = true)
    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
    }

    @Basic
    @Column(name = "id_customer", nullable = false)
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Basic
    @Column(name = "id_manufacturer", nullable = false)
    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    @Basic
    @Column(name = "id_supplier", nullable = false)
    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    @Basic
    @Column(name = "id_warehouse", nullable = false)
    public int getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(int idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    @Basic
    @Column(name = "alias", nullable = false, length = 32)
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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
    @Column(name = "lastname", nullable = false, length = 255)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
    @Column(name = "address1", nullable = false, length = 128)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "address2", nullable = true, length = 128)
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "postcode", nullable = true, length = 12)
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 64)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "other", nullable = true, length = -1)
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 32)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "phone_mobile", nullable = true, length = 32)
    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    @Basic
    @Column(name = "vat_number", nullable = true, length = 32)
    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Basic
    @Column(name = "dni", nullable = true, length = 16)
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
    @Column(name = "active", nullable = false)
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Basic
    @Column(name = "deleted", nullable = false)
    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return idAddress == that.idAddress &&
                idCountry == that.idCountry &&
                idCustomer == that.idCustomer &&
                idManufacturer == that.idManufacturer &&
                idSupplier == that.idSupplier &&
                idWarehouse == that.idWarehouse &&
                active == that.active &&
                deleted == that.deleted &&
                Objects.equals(idState, that.idState) &&
                Objects.equals(alias, that.alias) &&
                Objects.equals(company, that.company) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(address1, that.address1) &&
                Objects.equals(address2, that.address2) &&
                Objects.equals(postcode, that.postcode) &&
                Objects.equals(city, that.city) &&
                Objects.equals(other, that.other) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(phoneMobile, that.phoneMobile) &&
                Objects.equals(vatNumber, that.vatNumber) &&
                Objects.equals(dni, that.dni) &&
                Objects.equals(dateAdd, that.dateAdd) &&
                Objects.equals(dateUpd, that.dateUpd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAddress, idCountry, idState, idCustomer, idManufacturer, idSupplier, idWarehouse, alias, company, lastname, firstname, address1, address2, postcode, city, other, phone, phoneMobile, vatNumber, dni, dateAdd, dateUpd, active, deleted);
    }
}
