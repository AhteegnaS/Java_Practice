package program1;
import java.util.Scanner;

public class Calculator {
	
	    void add() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2 : ");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("The sum of num1 and num2 is " + result);	
		}
		
	    void sub(int a , int b) {					
	    int result = a - b;
	    System.out.println("The difference between num1 and num2 is " + result);
		}
		
		 int mul() {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the value of num1 : ");
		 int num1 = sc.nextInt();
		 System.out.println("Enter the value of num2 : ");
		 int num2 = sc.nextInt();
	     return num1 * num2;	
		}
		
	    int div(int a , int b) {
		return a / b;
		
		}
	
}

class Main{
  
	  public static void main(String []args) {
		  Scanner s = new Scanner (System.in);


		  Calculator cal = new Calculator();
		  cal.add();
		  
		  System.out.println("Enter the value of num1 : ");
		  int num1 = s.nextInt();
		  System.out.println("Enter the value of num2 : ");
		  int num2 = s.nextInt();
		  cal.sub(num1 , num2);
		
		  
		  int res = cal.mul();
		  System.out.println("The product of num1 and num2 is " + res);
		  
		  System.out.println("Enter the value of num1 : ");
		  int num3 = s.nextInt();
		  System.out.println("Enter the value of num2 : ");
		  int num4 = s.nextInt();
		  int res1 =  cal.div(num3 , num4);
		  System.out.println("The quotient of num1 and num2 is " + res1);
		  
		  
		  s.close();
	  }
  }


