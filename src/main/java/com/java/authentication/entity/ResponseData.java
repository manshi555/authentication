package com.java.authentication.entity;


public class ResponseData {
	
	 String agentName;
	 String clientName;
	 String totalBill;
	 
	 public ResponseData()
	 {
		 
	 }
 
	public ResponseData(String agentName, String clientName, String totalBill) {
		super();
		this.agentName = agentName;
		this.clientName = clientName;
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "ResponseData [agentName=" + agentName + ", clientName=" + clientName + ", totalBill=" + totalBill + "]";
	}
 
 
    
    
}
