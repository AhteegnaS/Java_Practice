package array_series;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Student names you want to store: ");
		int n = sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		System.out.println("Enter the name of the students:");
		for(int i = 0; i <= s.length-1; i++) {
			s[i] = sc.next();
		}
		
		System.out.println("The students you have collected are:");
		for(int i = 0; i <= s.length-1; i++) {
			System.out.println(s[i]);
		}
		System.out.println("The students you have collected are:");
		System.out.print("[");
		for(int i = 0; i <= s.length-1; i++) {
			System.out.print(s[i]);
			if(i!=s.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

	}

}
