package com.kodnest.Constructor.Shallowing;

public class Student {
  
	 int id;
	 String name;
	 int age;
	 int marks;
	 String email;
	 
	public Student(int id, String name, int age, int marks, String email) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.email = email;
	}

	public Student(String name, int age, int marks, String email) {
		
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.email = email;
	}
	
	
	 
	 
}
