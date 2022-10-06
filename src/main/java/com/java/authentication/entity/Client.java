package com.java.authentication.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Client")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="clientId")
	private int clientId;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "agency.agentId")
	private Agency agency;
		
	@NotNull(message = "Name is mandatory")
	@Column(name="clientName")
	private String clientName;
	
	@NotNull(message = "Email is mandatory")
	@Column(name="email")
	private String email;
	
	@NotNull(message = "PhoneNumber is mandatory")
	@Column(name="clientPhoneNumber")
	private String clientPhoneNumber;
	
	@NotNull(message = "TotalBill is mandatory")
	@Column(name="totalBill")
	private BigDecimal totalBill;
	
	
	public Client()
	{
		
	}


	public Client(int clientId, Agency agency, @NotNull(message = "Name is mandatory") String clientName,
			@NotNull(message = "Email is mandatory") String email,
			@NotNull(message = "PhoneNumber is mandatory") String clientPhoneNumber, 
			@NotNull(message = "TotalBill is mandatory") BigDecimal totalBill) {
		super();
		this.clientId = clientId;
		this.agency = agency;
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


	public Agency getAgency() {
		return agency;
	}


	public void setAgency(Agency agency) {
		this.agency = agency;
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


	public BigDecimal getTotalBill() {
		return totalBill;
	}


	public void setTotalBill(BigDecimal totalBill) {
		this.totalBill = totalBill;
	}


	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", agency=" + agency + ", clientName=" + clientName + ", email=" + email
				+ ", clientPhoneNumber=" + clientPhoneNumber + ", totalBill=" + totalBill + "]";
	}

}
