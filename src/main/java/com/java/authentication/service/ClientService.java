package com.java.authentication.service;


import java.util.Optional;

import com.java.authentication.entity.Client;

import net.minidev.json.JSONObject;

public interface ClientService {

	Optional<Client> updateClientDetails(Client client);
	

}
