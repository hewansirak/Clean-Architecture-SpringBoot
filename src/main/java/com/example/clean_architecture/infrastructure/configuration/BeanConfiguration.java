/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clean_architecture.infrastructure.configuration;

/**
 *
 * @author hewan
 */

import com.example.clean_architecture.adapters.repository.JpaUserRepository;
import com.example.clean_architecture.core.domain.UserRepository;
import com.example.clean_architecture.core.usecase.CreateUserUseCase;
import com.example.clean_architecture.core.usecase.GetUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateUserUseCase createUserUseCase(UserRepository userRepository) {
        return new CreateUserUseCase(userRepository);
    }

    @Bean
    public GetUserUseCase getUserUseCase(UserRepository userRepository) {
        return new GetUserUseCase(userRepository);
    }

    @Bean
    public UserRepository userRepository(JpaUserRepository jpaUserRepository) {
        return jpaUserRepository;
    }
}