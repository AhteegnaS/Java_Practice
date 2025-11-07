package noparawithretval;

public class Program1 {

	public static void main(String[] args) {
		int addRes = add();
		System.out.println(addRes);
	}
	static int add() 
	{
	 int num1 = 10;
	 int num2 = 26;
	 int result = num1 + num2;
	 return result;
	 
	}

}