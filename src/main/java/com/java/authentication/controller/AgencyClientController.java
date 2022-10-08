package com.java.authentication.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.authentication.entity.AuthenticationRequest;
import com.java.authentication.service.ClientService;

@RestController
@RequestMapping(value="/authz")
public class AgencyClientController {
	
	@Autowired
	ClientService clientService;
	
	@PostMapping("/add-details")
	public ResponseEntity<?> CreateAgency(@Valid @RequestBody AuthenticationRequest authenticationRequest){
		return new ResponseEntity<>(clientService.saveClient(authenticationRequest.getClient()),HttpStatus.CREATED);
		
	}

}
