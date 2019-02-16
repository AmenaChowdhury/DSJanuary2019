package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int num1;
		num1 = 10;
		try {
		  int result = num1/0;
		  System.out.println(result);
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("You should not divide a number by zero.");
		}
		System.out.println("We are here that means program did not quit on you");

	}

}
