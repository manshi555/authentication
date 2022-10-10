package com.java.authentication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
		
	@NotEmpty(message = "client name is mandatory")
	private String clientName;
	
	@NotEmpty(message = "client email is mandatory")
	@Email(message = "invalid email Id")
	@Column(name="email")
	private String email;
	
	@NotEmpty(message = "Client phone number is mandatory")
	@Pattern(regexp = "^\\d{10}$", message = "invalid client phone number")
	@Column(name="clientPhoneNumber")
	private String clientPhoneNumber;
	
	@NotEmpty(message = "TotalBill is mandatory")
	@Column(name="totalBill")
	private String totalBill;
	
	
	public Client()
	{
		
	}


	public Client(int clientId, @NotNull @NotEmpty String clientName,
			@NotNull String email,
			@NotNull String clientPhoneNumber, 
			@NotNull @NotEmpty String totalBill) {
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


	public String getTotalBill() {
		return totalBill;
	}


	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}


	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", agency="  + ", clientName=" + clientName + ", email=" + email
				+ ", clientPhoneNumber=" + clientPhoneNumber + ", totalBill=" + totalBill + "]";
	}

}
