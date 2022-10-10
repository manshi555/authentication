package com.java.authentication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.authentication.dao.AgencyDAO;
import com.java.authentication.dao.ClientDAO;
import com.java.authentication.entity.Client;

import net.minidev.json.JSONObject;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	 ClientDAO clientDAO;

	@Override
	public Optional<Client> updateClientDetails(Client client) {
		Optional<Client> clientOptional = clientDAO.findById(client.getClientId());
		if(clientOptional.isEmpty())
			return clientOptional ;
		client.setClientId(client.getClientId());
		clientDAO.save(client);
		return clientOptional;
	}

    
	
}
