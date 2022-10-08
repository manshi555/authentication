package com.java.authentication.service;


import com.java.authentication.entity.Client;

import net.minidev.json.JSONObject;

public interface ClientService {
	
	JSONObject saveClient(Client client);

}
