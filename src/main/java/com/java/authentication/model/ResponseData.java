package com.java.authentication.model;

public class ResponseData {

	
	private String agentName;
	private String clientName;
	private double totalBill;
	
	public ResponseData(String agentName, String clientName, double totalBill) {
		super();
		this.agentName = agentName;
		this.clientName = clientName;
		this.totalBill = totalBill;
	}
	
	public ResponseData() {
		// TODO Auto-generated constructor stub
	}

	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	@Override
	public String toString() {
		return "ResponseData [agentName=" + agentName + ", clientName=" + clientName + ", totalBill=" + totalBill + "]";
	}
	
	
	
}
