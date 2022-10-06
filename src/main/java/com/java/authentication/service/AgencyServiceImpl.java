package com.java.authentication.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.authentication.dao.AgencyDAO;
import com.java.authentication.entity.Agency;

@Service
public class AgencyServiceImpl implements AgencyService{

	
	@Autowired
	AgencyDAO agencyDAO;

	
	@Override
	public void saveAgency(Agency agency) {
		agencyDAO.save(agency);
		
	}


}
