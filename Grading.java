package controlstatements;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int N = sc.nextInt();
	
	if (N >= 91 && N <= 100) 
		System.out.println("A");
	else if (N >= 71 && N <= 90) 
			System.out.println("B");
	else if (N >= 51 && N <=70) 
		System.out.println("C");
	else if(N>=0 && N <= 50)
		System.out.println("0");
	sc.close();
	}
	
	

}
