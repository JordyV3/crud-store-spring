package com.jordy.crud.persistence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENT")
@SuppressWarnings("ALL")
public class Client {

    // This is an entity applying good practices
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Client_Id")
    private long clientId;

    @Column(name = "Name")
    private String name;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Description")
    private String description;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Status")
    private BigDecimal status = BigDecimal.ONE;

    @Column(name = "Create_At")
    @CreationTimestamp
    private Timestamp createdAt;

}
