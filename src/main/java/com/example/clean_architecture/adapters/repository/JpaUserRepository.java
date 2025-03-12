/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clean_architecture.adapters.repository;

import com.example.clean_architecture.core.domain.User;
import com.example.clean_architecture.core.domain.UserRepository;
import com.example.clean_architecture.infrastructure.persistence.UserEntity;
import com.example.clean_architecture.infrastructure.persistence.SpringDataUserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author hewan
 */

@Repository
public class JpaUserRepository implements UserRepository {
    private final SpringDataUserRepository springDataUserRepository;

    public JpaUserRepository(SpringDataUserRepository springDataUserRepository) {
        this.springDataUserRepository = springDataUserRepository;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserEntity.fromDomain(user);
        UserEntity savedEntity = springDataUserRepository.save(userEntity);
        return savedEntity.toDomain();
    }

    @Override
    public Optional<User> findById(Long id) {
        return springDataUserRepository.findById(id)
                .map(UserEntity::toDomain);
    }
}
