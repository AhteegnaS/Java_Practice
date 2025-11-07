package loopingstatements;
import java.util.Scanner;
public class continueInLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
	    for (int i = 1; i <= n; i++){
			if(i == n-2) {
				continue;
			}
			System.out.println(i);
		}
		
	
		int j = 1;
		while(j <= n) {
			if(j == n-1) {
			j++;
				continue;
			}
			System.out.println(j);
			j++;
		}
		
		
		int k = 1;
		do {
			if(k == n-1) {
				k++;
				continue;
			}
			System.out.println(k);
			k++;
		} while(k <= n);

		
		sc.close();
	}

}
