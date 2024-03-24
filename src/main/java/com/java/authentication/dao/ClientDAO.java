package com.java.authentication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.java.authentication.entity.Client;

@Repository
public interface ClientDAO extends JpaRepository<Client, Integer>{
	
}
