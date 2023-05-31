package com.jsp.Encapsulation;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Realme 6", "Realme", 15000, "6gb");
		m1.setSim1(new Sim1("Airtel", 52543243));
		m1.setSim2(new Sim2("Jio ", 98999898));
		m1.printEntireMobileDetails();
	}

}
