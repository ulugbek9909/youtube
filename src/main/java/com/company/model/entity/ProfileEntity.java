package com.company.model.entity;

import com.company.model.enums.ProfileRole;
import com.company.model.enums.ProfileStatus;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:33 AM
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProfileStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProfileRole role;
}




