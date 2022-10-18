package com.java.authentication.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

@Repository
public interface ClientDAO extends JpaRepository<Client, Integer>{
	
//	    select a.agent_name, c.client_name, max(c.total_bill) from agency a join agency_list_of_clients l on a.agent_id = l.agency_agent_id join Client c on c.client_id = l.list_of_clients_client_id;
//		@Query("select a.agentName, c.clientName, max(c.totalBill) from agency a join listOfClients l on a.agentId =: agentId join Client c on c.client_id =: clientId")
//		public Optional<Agency>findTopClient(@Param("agentId") int agentId, @Param("clientId") int clientId);


}
