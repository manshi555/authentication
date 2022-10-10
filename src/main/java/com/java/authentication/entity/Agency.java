package com.java.authentication.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



@Entity
@Table(name = "Agency")
public class Agency {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="agentId")
	private int agentId;
	
	@NotEmpty(message = "agent name is mandatory")
	@Column(name="agentName")
	private String agentName;
	
	@NotEmpty(message = " agent address is mandatory")
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@NotEmpty(message = "agent state is mandatory")
	@Column(name="state")
	private String state;
	
	@NotEmpty(message = "agent city is mandatory")
	@Column(name="city")
	private String city;
	
	@NotEmpty(message = "agent phone number is mandatory")
	@Pattern(regexp = "^\\d{10}$" , message="invalid agent mobile number")
	@Column(name="agentPhoneNumber")
	private String agentPhoneNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Client> listOfClients;
	
	public Agency()
	{
		
	}

	public Agency(int agentId,
			String agentName,
			String address1,
			String address2,
			String state,
			String city,
			String agentPhoneNumber,
			List<Client> listOfClients) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.city = city;
		this.agentPhoneNumber = agentPhoneNumber;
		this.listOfClients = listOfClients;
	}



	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAgentPhoneNumber() {
		return agentPhoneNumber;
	}

	public void setAgentPhoneNumber(String agentPhoneNumber) {
		this.agentPhoneNumber = agentPhoneNumber;
	}

	public List<Client> getListOfClients() {
		return listOfClients;
	}



	public void setListOfClients(List<Client> listOfClients) {
		this.listOfClients = listOfClients;
	}



	@Override
	public String toString() {
		return "Agency [agentId=" + agentId + ", agentName=" + agentName + ", address1=" + address1 + ", address2="
				+ address2 + ", state=" + state + ", city=" + city + ", agentPhoneNumber=" + agentPhoneNumber
				+ ", listOfClients=" + listOfClients + "]";
	}

	
	
}
