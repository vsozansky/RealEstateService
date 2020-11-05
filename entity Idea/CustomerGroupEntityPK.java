package com.jprestashop.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CustomerGroupEntityPK implements Serializable {
    private int idCustomer;
    private int idGroup;

    @Column(name = "id_customer", nullable = false)
    @Id
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Column(name = "id_group", nullable = false)
    @Id
    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerGroupEntityPK that = (CustomerGroupEntityPK) o;
        return idCustomer == that.idCustomer &&
                idGroup == that.idGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCustomer, idGroup);
    }
}
