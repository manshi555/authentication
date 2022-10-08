package com.java.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.authentication.dao.ClientDAO;
import com.java.authentication.entity.Client;

import net.minidev.json.JSONObject;

@Service
public class ClientServiceImpl implements ClientService{

	
	@Autowired
	ClientDAO clientDAO;

	public JSONObject saveClient(Client client) {
		JSONObject jsonObject = new JSONObject();
		clientDAO.save(client);
		jsonObject.put("status", "added");
		jsonObject.put("message", "success");
		return jsonObject;	
		
	}
    
	
}
