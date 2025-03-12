/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.clean_architecture.core.domain;
import java.util.Optional;

/**
 *
 * @author hewan
 */

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
}
