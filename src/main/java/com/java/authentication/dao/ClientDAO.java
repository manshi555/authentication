package com.java.authentication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.authentication.entity.Client;

public interface ClientDAO extends JpaRepository<Client, Integer>{

}
