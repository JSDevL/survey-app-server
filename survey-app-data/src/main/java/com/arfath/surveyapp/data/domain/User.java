package com.arfath.surveyapp.data.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "app_user")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User extends BaseEntity {
    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Collection<Role> roles;

    public User(Long id, LocalDateTime createdLocalDateTime, LocalDateTime updatedLocalDateTime, String userName, String firstName, String lastName, String email, String password, Collection<Role> roles) {
        super(id, createdLocalDateTime, updatedLocalDateTime);
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}
