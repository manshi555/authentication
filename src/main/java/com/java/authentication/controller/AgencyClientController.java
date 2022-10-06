package com.java.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;
import com.java.authentication.service.ClientService;

@RestController
@RequestMapping(value="/authz")
class AgencyClientController {
	
	@Autowired
	ClientService clientService;
	
	
    public static class NewBodyAuthz {
		private Agency agency;
		private Client client;
		public Agency getAgency() {
			return agency;
		}
		public void setAgency(Agency agency) {
			this.agency = agency;
		}
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
      
	      }

	@PostMapping("/add-agency-client")
	public void CreateAgency(@RequestBody NewBodyAuthz newBodyAuthz) {
		clientService.saveClient(newBodyAuthz.getClient());
	}

}
