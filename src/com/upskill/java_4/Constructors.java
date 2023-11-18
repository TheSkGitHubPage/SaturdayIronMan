package com.upskill.java_4;

public class Constructors {
	
	String studentName;
	int studentAge;
	

	public Constructors(String name) {
		studentName = name;
	}
	
	public Constructors(int age) {
		studentAge = age;
	}
	
	public Constructors(String name, int age) {
		studentName = name;
		studentAge = age;
	}

	public static void main(String[] args) {
		Constructors obj = new Constructors("upskill");
		System.out.println(obj.studentName);
		
		Constructors obj2 = new Constructors(30);
		System.out.println(obj2.studentAge);
		
		Constructors obj3 = new Constructors("Amma", 25);
		System.out.println(obj3.studentName);
		System.out.println(obj3.studentAge);

	}

}
