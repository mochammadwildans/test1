package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, String> {

}
