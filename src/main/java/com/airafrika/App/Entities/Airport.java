package com.airafrika.App.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "airport_id", nullable = false)
    private UUID id;

    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @Size(max = 255)
    @Column(name = "address")
    private String address;

    @Size(max = 255)
    @Column(name = "phone")
    private String phone;

    @Size(max = 50)
    @Column(name = "city", length = 50)
    private String city;

    @Size(max = 50)
    @Column(name = "country", length = 50)
    private String country;
}