package com.java.authentication.service;

import java.util.List;

import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

public interface ClientService {

	public Client updateClientDetails(int clientId, Client client);
	
}
