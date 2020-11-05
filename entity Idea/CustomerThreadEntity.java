package com.jprestashop.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer_thread", schema = "ps1761", catalog = "")
public class CustomerThreadEntity {
    private int idCustomerThread;
    private int idShop;
    private int idLang;
    private int idContact;
    private Integer idCustomer;
    private Integer idOrder;
    private Integer idProduct;
    private Object status;
    private String email;
    private String token;
    private Timestamp dateAdd;
    private Timestamp dateUpd;

    @Id
    @Column(name = "id_customer_thread", nullable = false)
    public int getIdCustomerThread() {
        return idCustomerThread;
    }

    public void setIdCustomerThread(int idCustomerThread) {
        this.idCustomerThread = idCustomerThread;
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
    @Column(name = "id_lang", nullable = false)
    public int getIdLang() {
        return idLang;
    }

    public void setIdLang(int idLang) {
        this.idLang = idLang;
    }

    @Basic
    @Column(name = "id_contact", nullable = false)
    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    @Basic
    @Column(name = "id_customer", nullable = true)
    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Basic
    @Column(name = "id_order", nullable = true)
    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "id_product", nullable = true)
    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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
    @Column(name = "token", nullable = true, length = 12)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerThreadEntity that = (CustomerThreadEntity) o;
        return idCustomerThread == that.idCustomerThread &&
                idShop == that.idShop &&
                idLang == that.idLang &&
                idContact == that.idContact &&
                Objects.equals(idCustomer, that.idCustomer) &&
                Objects.equals(idOrder, that.idOrder) &&
                Objects.equals(idProduct, that.idProduct) &&
                Objects.equals(status, that.status) &&
                Objects.equals(email, that.email) &&
                Objects.equals(token, that.token) &&
                Objects.equals(dateAdd, that.dateAdd) &&
                Objects.equals(dateUpd, that.dateUpd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCustomerThread, idShop, idLang, idContact, idCustomer, idOrder, idProduct, status, email, token, dateAdd, dateUpd);
    }
}
