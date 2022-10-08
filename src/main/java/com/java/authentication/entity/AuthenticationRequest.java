package com.java.authentication.entity;

public class AuthenticationRequest {
	
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
  
	public AuthenticationRequest()
	{
		
	}
	public AuthenticationRequest(Agency agency, Client client) {
		super();
		this.agency = agency;
		this.client = client;
	}
	@Override
	public String toString() {
		return "AuthenticationRequest [agency=" + agency + ", client=" + client + "]";
	}
	
	
      }