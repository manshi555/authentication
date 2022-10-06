package com.java.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.authentication.dao.AgencyDAO;
import com.java.authentication.dao.ClientDAO;
import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

@Service
public class ClientServiceImpl implements ClientService{

	
	@Autowired
	ClientDAO clientDAO;

	@Override
	public void saveClient(Client client) {
		clientDAO.save(client);	
	}

}
