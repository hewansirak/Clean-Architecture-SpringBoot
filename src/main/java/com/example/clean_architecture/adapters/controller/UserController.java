/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clean_architecture.adapters.controller;

/**
 *
 * @author hewan
 */

import com.example.clean_architecture.core.usecase.CreateUserUseCase;
import com.example.clean_architecture.core.usecase.GetUserUseCase;
import com.example.clean_architecture.core.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final GetUserUseCase getUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getUserUseCase = getUserUseCase;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return createUserUseCase.execute(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return getUserUseCase.execute(id);
    }
}