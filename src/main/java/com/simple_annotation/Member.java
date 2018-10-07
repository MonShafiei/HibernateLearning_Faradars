package com.simple_annotation;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mohsen on 18/10/07.
 */
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String family;
    @Embedded
    @ElementCollection
    private Set<Address> addresss = new HashSet<Address>();

    public Set<Address> getAddresss() {
        return addresss;
    }

    public void setAddresss(Set<Address> addresss) {
        this.addresss = addresss;
    }
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
