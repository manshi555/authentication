package com.java.authentication.service;



import com.java.authentication.entity.Agency;

import net.minidev.json.JSONObject;



public interface AgencyService {

	JSONObject saveAgent(Agency agency);
	
	public Agency findDetails(int agentId, int clientId);
	

}
