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
	
	
    //select a.agent_name, c.client_name, max(c.total_bill) from agency a join agency_list_of_clients l on a.agent_id = l.agency_agent_id join Client c on c.client_id = l.list_of_clients_client_id;
    @Query(value = "select a.agent_name, c.client_name, max(c.total_bill) from agency a join agency_list_of_clients l on a.agent_id = l.agency_agent_id join Client c on c.client_id = l.list_of_clients_client_id", nativeQuery = true)
	public List<ResponseData> findTopClient();

}
