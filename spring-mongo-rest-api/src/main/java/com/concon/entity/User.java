package com.concon.entity;

import org.springframework.data.annotation.Id;

import java.util.HashMap;

public class User {
    @Id
    private String id;
    private String name;
    private String vorname;
    private HashMap specification;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public HashMap getSpecification() {
        return specification;
    }

    public void setSpecification(HashMap specification) {
        this.specification = specification;
    }
}
