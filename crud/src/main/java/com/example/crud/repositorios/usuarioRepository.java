package com.example.crud.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.models.User;


public interface usuarioRepository extends JpaRepository<User, Long>{

}
