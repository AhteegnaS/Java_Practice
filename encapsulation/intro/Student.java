package com.kodnest.encapsulation.intro;
import java.util.Scanner;

public class Student {
  Scanner sc = new Scanner (System.in);               
        private String Name;
		private int age ;
		private int marks ;
	

	public void setData(String Name , int age ,int marks) {
		Name = sc.nextLine();
		System.out.println();
		age = sc.nextInt();
		marks = sc.nextInt();
		
		if (Name.length()!= 0)	{
			this.Name = Name;
			System.out.print("The student name is " + Name);
		} else {
			System.out.println("No STudent record found");
		}
		
		if (age > 20) {
			this.age = age;
			System.out.print(" Studies in higher section");
		} else {
			System.out.println(" - ");
		}
		
		if(marks > 35) {
			this.marks = marks;
			System.out.println(" has passed the exam with "+ marks + " marks.");
		} else {
			System.out.println(" -" );
		}
	}
	
	public String a() {
		return Name;
	}
	public int b() {
		return age;
	}
	public int c() {
		return marks;
	}
	
}

