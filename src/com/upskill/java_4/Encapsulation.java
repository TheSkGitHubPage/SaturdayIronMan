package com.upskill.java_4;

public class Encapsulation {

	private String name;
	private int ssn;
	private String username;

	// Setter Method - name
	public void setName(String value) { // SET THE DATA, WRITE - void method
		name = value;
	}

	// Getter Method - name
	public String getName() { // GET THE DATA, READ - return method
		return name;
	}

	public void setSsn(int value) {
		ssn = value;
	}

	public String getUserName() {
		return username;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Sean");
		System.out.println(obj.getName());
		obj.setSsn(1234456678);
		System.out.println(obj.getUserName());

	}

}
