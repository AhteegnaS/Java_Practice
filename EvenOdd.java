package controlstatements;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean res = methodEvenOdd(n);
		System.out.println("The number is " + res);
		scanner.close();

	}
	static boolean  methodEvenOdd(int a) {
       int res1 = a % 2;
      if (res1==0)
    	  return true;
      else 
    	  return false;
    	 
}
}
