package com.upskill.java_4;

public class Polymorphism {

	public static void main(String[] args) {
	car(4, "Blue");	
	
	Polymorphism obj = new Polymorphism();
	
	}
	
	public static void car() {
		System.out.println("My car is Tesla !");
	}
	
	public static void car(String color) {
		System.out.println("My car is Tesla! It has color: " + color);
	}
	
	public static void car (int door) {
		System.out.println("My car is Tesla! It has door: " + door);
	}
	
	public static void car (boolean isElectric) {
		System.out.println("Is my car electric: " + isElectric);
		
	}
	
	public static void car (int door, String color) {
		System.out.println("My car is Tesla! It has door: " + door + ", It has color:  " + color);
	}
	
	
	
	
	
	
}
