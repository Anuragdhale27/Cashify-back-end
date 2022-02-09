package com.dolawat.pashya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dolawat.pashya.Entity.UserEntity;

public interface RepositoryInterface extends JpaRepository<UserEntity, Long> {

}
