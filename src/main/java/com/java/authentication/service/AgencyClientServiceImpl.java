package com.java.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.authentication.dao.AgencyDAO;
import com.java.authentication.dao.ClientDAO;
import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

@Service
public class AgencyClientServiceImpl implements AgencyClientService{

	
	@Autowired
	AgencyDAO agencyDAO;
	
	@Autowired
	ClientDAO clientDAO;
	
	@Override
	public void saveAgency(Agency agency) {
		agencyDAO.save(agency);
		
	}

	@Override
	public void saveClient(Client client) {
		clientDAO.save(client);	
	}

}
