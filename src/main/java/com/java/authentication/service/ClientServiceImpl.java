package com.java.authentication.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.authentication.dao.ClientDAO;
import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	 ClientDAO clientDAO;

	@Override
	public Client updateClientDetails(int clientId, Client client) {
		Client clientData = clientDAO.findById(clientId).get();
		clientData.setClientName(client.getClientName());
		clientData.setClientPhoneNumber(client.getClientPhoneNumber());
		clientData.setEmail(client.getEmail());
		clientData.setTotalBill(client.getTotalBill());
		return clientDAO.save(clientData);
	}
                            
    
//	@Override
//	public List<Client> findDetails(int agentId, int clientId) {
//		 Optional<Agency> a = clientDAO.findTopClient(agentId, clientId);
//		 if(a.isPresent())
//		    return a.get().getListOfClients();
//		 
//		return null;
//	}
}
