package com.java.authentication.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.java.authentication.entity.Agency;

public interface AgencyDAO extends JpaRepository<Agency, Integer>{

}
