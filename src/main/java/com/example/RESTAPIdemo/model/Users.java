package com.example.RESTAPIdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

enum Gender {
    M, F
}

@Entity
@Table(name = "users")
@Data
public class Users {
    /** ID */
    @Id
    private int id;

    /** 性 */
    private String firstName;

    /** 名 */
    private String lastName;

    /** 性別 */
    @Enumerated(EnumType.STRING)
    private Gender gender;

    /** 年齢 */
    private int age;
}
