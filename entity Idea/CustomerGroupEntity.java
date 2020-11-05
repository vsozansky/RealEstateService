package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer_group", schema = "ps1761", catalog = "")
@IdClass(CustomerGroupEntityPK.class)
public class CustomerGroupEntity {
    private int idCustomer;
    private int idGroup;

    @Id
    @Column(name = "id_customer", nullable = false)
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Id
    @Column(name = "id_group", nullable = false)
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
        CustomerGroupEntity that = (CustomerGroupEntity) o;
        return idCustomer == that.idCustomer &&
                idGroup == that.idGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCustomer, idGroup);
    }
}
