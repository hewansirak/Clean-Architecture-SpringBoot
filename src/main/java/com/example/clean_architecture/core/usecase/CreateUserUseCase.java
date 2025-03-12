/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clean_architecture.core.usecase;

import com.example.clean_architecture.core.domain.User;
import com.example.clean_architecture.core.domain.UserRepository;


/**
 *
 * @author hewan
 */

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user) {
        return userRepository.save(user);
    }
}