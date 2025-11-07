package array_series;

import java.util.Scanner;

public class ArrayDemo {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements you want to store: ");
	int n = sc.nextInt();
	
	int arr[] = new int[n];

	System.out.println("Enter the data of elements:");
	for(int i = 0; i <= arr.length-1;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("The Array you have stored is: ");
	for(int i = 0; i <= arr.length-1;i++) {
		System.out.println(arr[i]); 
	}
	
  }
}
