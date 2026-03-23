package day2;

public class CalculatorMain {

    public static void main(String[] args) {
        int option;
        try {
            do {

                System.out.println("1.  Addition of two Integer.");
                System.out.println("2.  Addition of two Float.");
                System.out.println("3.  Addition of Integer and Float.");

                System.out.println("4.  Subtraction of two Integer.");
                System.out.println("5.  Substraction of two Float.");
                System.out.println("6.  Substraction of Integer and Float.");

                System.out.println("7.  Multiplication of two Integer.");
                System.out.println("8.  Multiplication of two Float.");
                System.out.println("9.  Multiplication of Integer and Float.");

                System.out.println("10. Division of two Integer.");
                System.out.println("11. Division of two Float.");
                System.out.println("12. Division of Integer and Float.");
                System.out.println("13. Exit....");

                System.out.println("Enter your choice...:");
                option = ConsoleInput.getInt();
                System.out.println(option);

                switch (option) {

                    case 1: {
                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        int num2 = ConsoleInput.getInt();
                        System.out.println("Addition of two no is: " + Calculator.addition(num1, num2));
                        break;
                    }
                    case 2: {
                        System.out.print("Enter num1: ");
                        float num1 = ConsoleInput.getFLoat();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Addition of two no is: " + Calculator.addition(num1, num2));
                        break;
                    }
                    case 3: {
                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Addition of two no is: " + Calculator.addition(num1, num2));
                        break;
                    }
                    case 4: {
                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        int num2 = ConsoleInput.getInt();
                        System.out.println("Subtraction of two no is: " + Calculator.subtract(num1, num2));
                        break;
                    }
                    case 5: {
                        System.out.print("Enter num1: ");
                        float num1 = ConsoleInput.getFLoat();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Subtraction of two no is: " + Calculator.subtract(num1, num2));
                        break;
                    }
                    case 6: {
                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Subtraction of two no is: " + Calculator.subtract(num1, num2));
                        break;
                    }
                    case 7: {
                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        int num2 = ConsoleInput.getInt();
                        System.out.println("Multiplication of two no is: " + Calculator.multiplication(num1, num2));
                        break;
                    }
                    case 8: {
                        System.out.print("Enter num1: ");
                        float num1 = ConsoleInput.getFLoat();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Multiplication of two no is: " + Calculator.multiplication(num1, num2));
                        break;
                    }
                    case 9: {
                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Multiplication of two no is: " + Calculator.multiplication(num1, num2));
                        break;
                    }
                    case 10: {

                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        int num2 = ConsoleInput.getInt();
                        System.out.println("Divide of two no is: " + Calculator.divide(num1, num2));
                        break;
                    }
                    case 11: {
                        System.out.print("Enter num1: ");
                        float num1 = ConsoleInput.getFLoat();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Divide of two no is: " + Calculator.divide(num1, num2));
                        break;

                    }
                    case 12: {
                        System.out.print("Enter num1: ");
                        int num1 = ConsoleInput.getInt();
                        System.out.print("Enter num2: ");
                        float num2 = ConsoleInput.getFLoat();
                        System.out.println("Divide of two no is: " + Calculator.divide(num1, num2));
                        break;
                    }
                    case 13: {
                        System.out.println("Thank you for visit.....!");
                        break;
                    }
                    default:
                        System.out.println("Invalid Choice Please Enter Correct Choice");
                        break;
                }
            } while (option != 13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
