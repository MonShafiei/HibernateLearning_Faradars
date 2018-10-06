package com.mohsen.entitiy;



import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Mohsen on 18/10/06.
 */
//@Entity
public class Person {
    //@Id
    private Integer id;
    private String name;
    private String family;

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

    public Person(Integer id, String name, String family) {
        this.id = id;
        this.name = name;
        this.family = family;
    }
    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }
    public Person() {

    }
}
