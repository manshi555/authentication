package com.java.authentication.service;


import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

public interface AgencyClientService {
	
	void saveAgency(Agency agency);
	void saveClient(Client client);

}
