package loopingstatements;

public class Program1 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<=3;j++) {
				if(j==2) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}
		outer: for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<=3;j++) {
				if(i==3) {
					break outer;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
