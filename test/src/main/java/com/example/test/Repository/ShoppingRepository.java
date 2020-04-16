package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.Model.ShoppingModel;

public interface ShoppingRepository extends JpaRepository<ShoppingModel, String> {

}
