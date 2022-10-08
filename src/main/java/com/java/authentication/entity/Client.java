package com.java.authentication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Client")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="clientId")
	private int clientId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "agency.agentId")
	private Agency agency;
	
	@NotNull(message = "client name  cannot be null")
	@NotEmpty(message = "client name  cannot be empty")
	private String clientName;
	
	@NotNull(message = "client email cannot be null")
	@NotEmpty(message = "client email cannot be empty")
	@Email(message = "invalid email Id")
	@Column(name="email")
	private String email;
	
	@NotNull(message = "Client phone number cannot be null")
	@Pattern(regexp = "^\\d{10}$", message = "invalid client phone number")
	@Column(name="clientPhoneNumber")
	private String clientPhoneNumber;
	
	@NotNull(message = "TotalBill cannot be null")
	@NotEmpty(message = "TotalBill cannot be empty")
	@Column(name="totalBill")
	private String totalBill;
	
	
	public Client()
	{
		
	}


	public Client(int clientId, Agency agency,@NotNull @NotEmpty String clientName,
			@NotNull String email,
			@NotNull String clientPhoneNumber, 
			@NotNull @NotEmpty String totalBill) {
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


	public String getTotalBill() {
		return totalBill;
	}


	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}


	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", agency=" + agency + ", clientName=" + clientName + ", email=" + email
				+ ", clientPhoneNumber=" + clientPhoneNumber + ", totalBill=" + totalBill + "]";
	}

}
