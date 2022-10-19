package com.java.authentication.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.authentication.entity.Agency;

@Repository
public interface AgencyDAO extends JpaRepository<Agency, Integer>{
	
	
	//public  String GET_DETAILS = "select a.agent_name, c.client_name, max(c.total_bill) from agency a join agency_list_of_clients l on a.agent_id = l.agency_agent_id join Client c on c.client_id = l.list_of_clients_client_id" ;
 
}
