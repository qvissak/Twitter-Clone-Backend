package com.alexanderleehahn.TwitterClone.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public User() {}


    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;

    }

    public String getName() {
        return name;
    }

}
