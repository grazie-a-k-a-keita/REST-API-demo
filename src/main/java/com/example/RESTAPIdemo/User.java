package com.example.RESTAPIdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    /** ID */
    @Id
    private int id;

    /** 性 */
    private String firstName;

    /** 名 */
    private String lastName;

    /** 性別 */
    private String gender;

    /** 年齢 */
    private int age;
}