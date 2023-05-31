package com.jsp.Encapsulation;

public class Mobile {
	private String mobile_name;
	private String brand;
	private double price;
	private String ram;
	private Sim1 sim1;
	private Sim2 sim2;
	
	public Mobile(String mobile_name,String brand, double price,String ram) {
		this.mobile_name=mobile_name;
		this.brand=brand;
		this.price=price;
		this.ram=ram;
	}
	public Sim1 getSim1() {
		return sim1;
	}
	public void setSim1(Sim1 sim1) {
		this.sim1 = sim1;
	}
	public Sim2 getSim2() {
		return sim2;
	}
	public void setSim2(Sim2 sim2) {
		this.sim2 = sim2;
	}
	public String getMobile_name() {
		return mobile_name;
	}
	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public void printEntireMobileDetails() {
	System.out.println( "Mobile Name is:" + mobile_name);
	System.out.println("Brand of the Mobile is:"+ brand);
	System.out.println("Price of the Mobile is :"+ price);
	System.out.println("Ram of the mobile is :" + ram);
	if(sim1!=null) {
		sim1.printSim1Details();
	} else {
		System.out.println(" No Sim1 is Available");
	}
	if(sim2!=null) {
		sim2.printSim2Details();
	}
	else {
		System.out.println("No sim2 is available");
	}
		
		
	}

}
