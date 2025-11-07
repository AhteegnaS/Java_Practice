package array_series;

import java.util.Scanner;

public class Bank3DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of banks: ");
		
		String arr[][][] = new String[sc.nextInt()][][];
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = new String[sc.nextInt()][];
			for(int j = 0; j <= arr[i].length-1; j++) {
				arr[i][j] = new String[sc.nextInt()];
				System.out.println("Enter the number of branches of the bank " + i + " are: ");
				for(int k = 0; k <= arr[i][j].length-1; k++) {
					System.out.println("Enter the bank " + i + "2"
							+ " has branch " + j + " customers " + k);
					arr[i][j][k] = sc.next();
				}
			}
		}
		
		for(int i = 0; i <= arr.length-1; i++) {
			for(int j = 0; j <= arr[i].length-1; j++) {
				for(int k = 0; k <= arr[i][j].length-1; k++) {
					System.out.print(arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println("==============");
		}
	}

}
