package com.example.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;
    private String address;
    private String status;
    private Date createdAt;
}
