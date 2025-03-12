/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.clean_architecture.infrastructure.persistence;

/**
 *
 * @author hewan
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataUserRepository extends JpaRepository<UserEntity, Long> {
    // Custom query methods can be added here if needed
    // Example: Optional<UserEntity> findByEmail(String email);
}