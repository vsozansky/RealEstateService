package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "ps1761", catalog = "")
public class ContactEntity {
    private int idContact;
    private String email;
    private byte customerService;
    private byte position;

    @Id
    @Column(name = "id_contact", nullable = false)
    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
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
    @Column(name = "customer_service", nullable = false)
    public byte getCustomerService() {
        return customerService;
    }

    public void setCustomerService(byte customerService) {
        this.customerService = customerService;
    }

    @Basic
    @Column(name = "position", nullable = false)
    public byte getPosition() {
        return position;
    }

    public void setPosition(byte position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEntity that = (ContactEntity) o;
        return idContact == that.idContact &&
                customerService == that.customerService &&
                position == that.position &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContact, email, customerService, position);
    }
}
