package com.jsp.Encapsulation;

public class Sim2 {
	private String service_provider;
	private long contact_number;
	
	public Sim2(String service_provider,long contact_number) {
		this.service_provider=service_provider;
		this.contact_number=contact_number;
		
	}

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	
	public void printSim2Details() {
		System.out.println("Sim2 config.....");
		System.out.println("sim2 service provider is :" + service_provider);
		System.out.println("Sim2 contact number is:"+ contact_number);
	}
	
}
