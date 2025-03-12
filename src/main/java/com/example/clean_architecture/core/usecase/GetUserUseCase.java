/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clean_architecture.core.usecase;

import com.example.clean_architecture.core.domain.User;
import com.example.clean_architecture.core.domain.UserRepository;

import java.util.Optional;

/**
 *
 * @author hewan
 */

public class GetUserUseCase {
    private final UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> execute(Long id) {
        return userRepository.findById(id);
    }
}