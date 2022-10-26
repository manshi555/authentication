package com.java.authentication.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.java.authentication.entity.Agency;
import com.java.authentication.model.ResponseData;

@Repository
public interface AgencyDAO extends JpaRepository<Agency, Integer>{
	
	
     @Query(value = "SELECT new com.java.authentication.model.ResponseData(a.agentName, c.clientName, max(c.totalBill)) FROM Agency a JOIN a.listOfClients c")
	 public ResponseData findTopClient();
}
