package com.java.authentication.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.authentication.dao.AgencyDAO;
import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

import net.minidev.json.JSONObject;




@Service
public class AgencyServiceImpl implements AgencyService{

	@Autowired
	 AgencyDAO agencyDAO;
	
	@Override
	public JSONObject saveAgent(Agency agency) {
		
		JSONObject jsonObject = new JSONObject();
		agencyDAO.save(agency);
		jsonObject.put("status", "added");
		jsonObject.put("message", "success");
		return jsonObject;	
		
	}

	public Agency findDetails(int agentId, int clientId) {
		 Optional<Agency> a = agencyDAO.findTopClient(agentId, clientId);
		 if(a.isPresent())
		 {
		    return a.get();
		 }
		 return null;
		}

}
