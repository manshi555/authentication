package com.java.authentication.controller;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.authentication.entity.AuthenticationRequest;
import com.java.authentication.service.AgencyService;
import com.java.authentication.service.ClientService;

@RestController
@RequestMapping(value="/authz")
public class AgencyClientController {
	
	@Autowired
	AgencyService agencyService;
	
	@Autowired
	ClientService clientService;
	
	
	@PostMapping("/add-details")
	public ResponseEntity<?> CreateAgency(@Valid @RequestBody AuthenticationRequest authenticationRequest){
		return new ResponseEntity<>(agencyService.saveAgent(authenticationRequest.getAgency()),HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/update-details/{clientId}")
	public ResponseEntity<?> UpdateClient(@Valid @RequestBody AuthenticationRequest authenticationRequest, @PathVariable(value = "clientId") int clientId){
		return new ResponseEntity<>(clientService.updateClientDetails(clientId , authenticationRequest.getClient()),HttpStatus.NO_CONTENT);
	}
   
	@GetMapping("/get-details")
	public ResponseEntity<?> showDetails()
	{
		return new ResponseEntity<>(agencyService.findDetails(),HttpStatus.OK); 
	}
}
