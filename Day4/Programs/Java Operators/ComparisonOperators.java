public class ComparisonOperators{

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        // Equality
        System.out.println("num1 == num2: " + (num1 == num2)); // false

        // Inequality
        System.out.println("num1 != num2: " + (num1 != num2)); // true

        // Greater than and less than
        System.out.println("num1 > num2: " + (num1 > num2)); // true
        System.out.println("num1 < num2: " + (num1 < num2)); // false

        // Greater than or equal to and less than or equal to
        System.out.println("num1 >= num2: " + (num1 >= num2)); // true
        System.out.println("num1 <= num2: " + (num1 <= num2)); // false
    }
}
