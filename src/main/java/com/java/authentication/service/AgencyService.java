package com.java.authentication.service;



import com.java.authentication.entity.Agency;
import com.java.authentication.model.ResponseData;

import net.minidev.json.JSONObject;



public interface AgencyService {

	JSONObject saveAgent(Agency agency);
	
	public ResponseData findDetails();
	

}
