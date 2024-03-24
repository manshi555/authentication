package com.java.authentication.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.authentication.dao.AgencyDAO;
import com.java.authentication.entity.Agency;
import com.java.authentication.model.ResponseData;
import com.java.authentication.repository.CommonFunctionalityRepo;

import net.minidev.json.JSONObject;




@Service
public class AgencyServiceImpl implements AgencyService{

	@Autowired
	 AgencyDAO agencyDAO;
	
	@Autowired
	CommonFunctionalityRepo commonRepo;
	
	@Override
	public JSONObject saveAgent(Agency agency) {
		
		JSONObject jsonObject = new JSONObject();
		agencyDAO.save(agency);
		jsonObject.put("status", "added");
		jsonObject.put("message", "success");
		return jsonObject;	
		
	}

	public ResponseData findDetails() {
		// Using Spring Data JPA
		ResponseData response = agencyDAO.findTopClient();
		// Using JDBC template
		// ResponseData response = commonRepo.findTopClient();
		 return response;
		}

}
