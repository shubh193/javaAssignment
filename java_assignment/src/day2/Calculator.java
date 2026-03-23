package day2;

public class Calculator {

    // addition
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static float addition(float num1, float num2) {
        return num1 + num2;
    }

    public static double addition(int num1, float num2) {
        return num1 + num2;
    }

    // subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static double subtract(int num1, float num2) {
        return num1 - num2;
    }

    // multiplication
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static float multiplication(float num1, float num2) {
        return num1 * num2;
    }

    public static double multiplication(int num1, float num2) {
        return num1 * num2;
    }

    // division
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.err.println("Error: Integer division by zero.");
            return 0;
        }
        return num1 / num2;
    }

    public static float divide(float num1, float num2) {
        if (num2 == 0.0f) {
            System.err.println("Warning: Floating point division by zero (Infinity).");
        }
        return num1 / num2;
    }

    public static double divide(int num1, float num2) {
        if (num2 == 0.0f) {
            System.err.println("Warning: Mixed division by zero.");
        }
        return (double) num1 / num2;
    }

}
