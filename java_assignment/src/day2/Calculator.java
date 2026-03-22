package day2;

public class Calculator {

	//addition
	public static int addition(int num1, int num2 ) {
		return num1 + num2;
	}
	
	public static float addition(float num1, float num2 ) {
		return num1 + num2;
	}
	
	public static double addition(int num1, float num2 ) {
		return num1 + num2;
	}
	
	//subtraction
	public static int substract(int num1, int num2 ) {
		return num1 - num2;
	}
	
	public static float substract(float num1, float num2 ) {
		return num1 - num2;
	}
	
	public static double substract(int num1, float num2 ) {
		return num1 - num2;
	}

	
	//multiplication
	public static int Multiplication(int num1, int num2 ) {
		return num1 * num2;
	}
	
	public static float Multiplication(float num1, float num2 ) {
		return num1 * num2;
	}
	
	public static double Multiplication(int num1, float num2 ) {
		return num1 * num2;
	}
	
	//division
	public static int Divide(int num1, int num2 ) {
		try {
			
			if(num2 == 0) {
				System.out.println("Exception occured........");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello exception");
		return num1 / num2;
	}
	
	public static float Divide(float num1, float num2 ) {
		return num1 / num2;
	}
	
	public static double Divide(int num1, float num2 ) {
		return num1 / num2;
	}


}
