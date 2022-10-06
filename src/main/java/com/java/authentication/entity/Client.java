package com.java.authentication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "demoClient")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="clientId")
	private int clientId;
	
	@Column(name="agentId")
	private int agentId;
		
	@NotNull(message = "Name is mandatory")
	@Column(name="clientName")
	private String clientName;
	
	@NotNull(message = "Email is mandatory")
	@Column(name="email")
	private String email;
	
	@NotNull(message = "PhoneNumber is mandatory")
	@Column(name="clientPhoneNumber")
	private String clientPhoneNumber;
	
	@Column(name="totalBill")
	private double totalBill;
	
	
	public Client()
	{
		
	}


	public Client(int clientId, int agentId, @NotNull(message = "Name is mandatory") String clientName,
			@NotNull(message = "Email is mandatory") String email,
			@NotNull(message = "PhoneNumber is mandatory") String clientPhoneNumber,
			double totalBill) {
		super();
		this.clientId = clientId;
		this.agentId = agentId;
		this.clientName = clientName;
		this.email = email;
		this.clientPhoneNumber = clientPhoneNumber;
		this.totalBill = totalBill;
	}


	public int getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	public int getAgentId() {
		return agentId;
	}


	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}


	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}


	public double getTotalBill() {
		return totalBill;
	}


	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}


	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", agentId=" + agentId + ", clientName=" + clientName + ", email="
				+ email + ", clientPhoneNumber=" + clientPhoneNumber + ", totalBill=" + totalBill + "]";
	}
   
	
   
}
