package com.multistepapp.multistepapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_data")
@Getter
@Setter
public class UserDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "national_code", nullable = false)
    private String nationalCode;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "province", nullable = false)
    private String province;

    @Column(name = "uploaded_document", nullable = false)
    private String uploadedDocument;
}
