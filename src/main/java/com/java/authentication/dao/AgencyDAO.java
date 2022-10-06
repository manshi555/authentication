package com.java.authentication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.authentication.entity.Agency;

@Repository
public interface AgencyDAO extends JpaRepository<Agency, Integer>{

}
