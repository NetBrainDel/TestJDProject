package com.noirix.domain.hibernate;

import com.noirix.domain.Gender;
import lombok.Data;

import javax.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "m_users")
public class HibernateUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY/*SEQUENCE*/)
    private  Long id;

    @Column
    private String username;

    @Column
    private String surname;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    //private LocalDateTime birthDate;
    private Date birthDate;

    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender = Gender.NOT_SELECTED;

    @Column
    private Timestamp created;

    @Column
    private Timestamp changed;

    @Column
    private Float weight;

    @Column
    private String login;

    @Column
    private String password;



}
