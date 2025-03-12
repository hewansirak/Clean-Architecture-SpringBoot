/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clean_architecture.infrastructure.persistence;

/**
 *
 * @author hewan
 */

import com.example.clean_architecture.core.domain.User;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Default constructor for JPA
    public UserEntity() {}

    public UserEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Convert to domain model
    public User toDomain() {
        return new User(this.id, this.name, this.email);
    }

    // Convert from domain model
    public static UserEntity fromDomain(User user) {
        return new UserEntity(user.getId(), user.getName(), user.getEmail());
    }
}
