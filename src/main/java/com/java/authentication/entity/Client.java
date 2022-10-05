package com.java.authentication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "demoClient")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="clientId")
	private int clientId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agency.agentId")
	private Agency agency;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name="clientName")
	private String clientName;
	
	@NotBlank(message = "Email is mandatory")
	@Column(name="email")
	private String email;
	
	@NotBlank(message = "PhoneNumber is mandatory")
	@Column(name="clientPhoneNumber")
	private String clientPhoneNumber;
	
	@NotBlank(message = "TotalBill is mandatory")
	@Column(name="totalBill")
	private double totalBill;
	
	
	public Client()
	{
		
	}


	public Client(int clientId, Agency agency, @NotBlank(message = "Name is mandatory") String clientName,
			@NotBlank(message = "Email is mandatory") String email,
			@NotBlank(message = "PhoneNumber is mandatory") String clientPhoneNumber,
			@NotBlank(message = "TotalBill is mandatory") double totalBill) {
		super();
		this.clientId = clientId;
		this.agency = agency;
		this.clientName = clientName;
		this.email = email;
		this.clientPhoneNumber = clientPhoneNumber;
		this.totalBill = totalBill;
	}


	public Client(int clientId, @NotBlank(message = "Name is mandatory") String clientName,
			@NotBlank(message = "Email is mandatory") String email,
			@NotBlank(message = "PhoneNumber is mandatory") String clientPhoneNumber,
			@NotBlank(message = "TotalBill is mandatory") double totalBill) {
		super();
		this.clientId = clientId;
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
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", email=" + email + ", phoneNumber="
				+ clientPhoneNumber + ", totalBill=" + totalBill + "]";
	}
    
	

}
