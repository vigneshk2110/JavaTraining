public class ArithmeticOperators{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

        // Division (for integers, performs integer division)
        int quotient = num1 / num2; 
        System.out.println("Division (integers): " + num1 + " / " + num2 + " = " + quotient);

        // Floating-point division (requires casting one operand to double)
        double doubleNum1 = (double) num1;
        double division = doubleNum1 / num2;
        System.out.println("Division (floating-point): " + doubleNum1 + " / " + num2 + " = " + division);

        // Modulo (remainder after division)
        int remainder = num1 % num2;
        System.out.println("Modulo: " + num1 + " % " + num2 + " = " + remainder);


        int a = 10;
        a = 10.5;
        int b = 10.5;

    }
}
