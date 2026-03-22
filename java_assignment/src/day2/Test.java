package day2;

public class Test {

	public static void main(String[] args) {
		try {
			// byte[] choice = new byte[100];
			int option = 0;

			do {

				System.out.println("1. Addition: ");
				System.out.println("2. Substraction: ");
				System.out.println("3. Multiplication: ");
				System.out.println("4. Division: ");
				System.out.println("5. Exit.............! ");

				option = ConsoleInput.getInt();

				switch (option) {
					case 1: {
						do {
							System.out.println("1. Two Integer ");
							System.out.println("2. Two Float ");
							System.out.println("3. one Integer and one Float ");
							System.out.println("Enter Your Choice: ");
							option = ConsoleInput.getInt();
							switch (option) {

								case 1: {
									System.out.println("Enter Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Num2: ");
									int num2 = ConsoleInput.getInt();

									int result = Calculator.addition(num1, num2);
									System.out.println("Addition is : " + result);
									break;
								}
								case 2: {
									System.out.println("Enter Num1: ");
									float num1 = ConsoleInput.getFLoat();

									System.out.println("Enter Num2: ");
									float num2 = ConsoleInput.getFLoat();

									float result = Calculator.addition(num1, num2);
									System.out.println("Addition is : " + result);
									break;
								}

								case 3: {
									System.out.println("Enter Integer Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Float Num2: ");
									float num2 = ConsoleInput.getFLoat();

									double result = Calculator.addition(num1, num2);
									System.out.println("Addition is : " + result);
									break;
								}

								case 4:
									System.out.println("Exiting.................!");
									break;
								default: {
									System.out.println("Invalid Choice Please Enter Correct Choice");
									break;

								}
							}
						} while (option != 4);
					}

					case 2:

					{
						do {
							System.out.println("1. Two Integer ");
							System.out.println("2. Two Float ");
							System.out.println("3. one Integer and one Float ");
							System.out.println("Enter Your Choice: ");
							option = ConsoleInput.getInt();
							switch (option) {

								case 1: {
									System.out.println("Enter Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Num2: ");
									int num2 = ConsoleInput.getInt();

									int result = Calculator.substract(num1, num2);
									System.out.println("Substraction is : " + result);
									break;
								}
								case 2: {
									System.out.println("Enter Num1: ");
									float num1 = ConsoleInput.getFLoat();

									System.out.println("Enter Num2: ");
									float num2 = ConsoleInput.getFLoat();

									float result = Calculator.substract(num1, num2);
									System.out.println("Substraction is : " + result);
									break;
								}

								case 3: {
									System.out.println("Enter Integer Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Float Num2: ");
									float num2 = ConsoleInput.getFLoat();

									double result = Calculator.substract(num1, num2);
									System.out.println("Substraction is : " + result);
									break;
								}

								case 4:
									System.out.println("Exiting.................!");
									break;
								default: {
									System.out.println("Invalid Choice Please Enter Correct Choice");
									break;

								}
							}
						} while (option != 4);
					}

					case 3:

					{
						do {
							System.out.println("1. Two Integer ");
							System.out.println("2. Two Float ");
							System.out.println("3. one Integer and one Float ");
							System.out.println("Enter Your Choice: ");
							option = ConsoleInput.getInt();
							switch (option) {

								case 1: {
									System.out.println("Enter Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Num2: ");
									int num2 = ConsoleInput.getInt();

									int result = Calculator.Multiplication(num1, num2);
									System.out.println("Multiplication is : " + result);
									break;
								}
								case 2: {
									System.out.println("Enter Num1: ");
									float num1 = ConsoleInput.getFLoat();

									System.out.println("Enter Num2: ");
									float num2 = ConsoleInput.getFLoat();

									float result = Calculator.Multiplication(num1, num2);
									System.out.println("Multiplication is : " + result);
									break;
								}

								case 3: {
									System.out.println("Enter Integer Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Float Num2: ");
									float num2 = ConsoleInput.getFLoat();

									double result = Calculator.Multiplication(num1, num2);
									System.out.println("Multiplication is : " + result);
									break;
								}

								case 4:
									System.out.println("Exiting.................!");
									break;
								default: {
									System.out.println("Invalid Choice Please Enter Correct Choice");
									break;

								}
							}
						} while (option != 4);
					}

					case 4:

					{
						do {
							System.out.println("1. Two Integer ");
							System.out.println("2. Two Float ");
							System.out.println("3. one Integer and one Float ");
							System.out.println("Enter Your Choice: ");
							option = ConsoleInput.getInt();
							switch (option) {

								case 1: {
									System.out.println("Enter Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Num2: ");
									int num2 = ConsoleInput.getInt();

									int result = Calculator.Divide(num1, num2);
									System.out.println("Division is : " + result);
									break;
								}
								case 2: {
									System.out.println("Enter Num1: ");
									float num1 = ConsoleInput.getFLoat();

									System.out.println("Enter Num2: ");
									float num2 = ConsoleInput.getFLoat();

									float result = Calculator.Divide(num1, num2);
									System.out.println("Division is : " + result);
									break;
								}

								case 3: {
									System.out.println("Enter Integer Num1: ");
									int num1 = ConsoleInput.getInt();

									System.out.println("Enter Float Num2: ");
									float num2 = ConsoleInput.getFLoat();

									double result = Calculator.Divide(num1, num2);
									System.out.println("Division is : " + result);
									break;
								}

								case 4:
									System.out.println("Exiting.................!");
									break;
								default: {
									System.out.println("Invalid Choice Please Enter Correct Choice");
									break;

								}
							}
						} while (option != 4);
					}

					case 5:
						System.out.println("Exiting.................!");
						break;

					default: {
						System.out.println("Invalid Choice Please Enter Correct Choice");
						break;
					}

				}

			} while (option != 4);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
