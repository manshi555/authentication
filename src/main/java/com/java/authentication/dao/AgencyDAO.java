package com.java.authentication.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.authentication.entity.Agency;
import com.java.authentication.entity.ResponseData;

@Repository
public interface AgencyDAO extends JpaRepository<Agency, Integer>{
	
	
	//public  String GET_DETAILS = "select a.agent_name, c.client_name, max(c.total_bill) from agency a join agency_list_of_clients l on a.agent_id = l.agency_agent_id join Client c on c.client_id = l.list_of_clients_client_id" ;
    @Query(value = "SELECT a.agent_name, c.client_name, max(c.total_bill) from agency a JOIN agency_list_of_clients l ON a.agent_id = l.agency_agent_id JOIN Client c ON c.client_id = l.list_of_clients_client_id", nativeQuery = true)
	ResponseData findTopClient();
 
}
