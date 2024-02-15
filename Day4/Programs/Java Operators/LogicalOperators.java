public class LogicalOperators{

    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        // Logical AND (&&)
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // false (both must be true)

        // Logical OR (||)
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // true (at least one must be true)

        // Logical NOT (!)
        System.out.println("!condition1: " + (!condition1)); // false (negates the value)

        // More complex examples
        int num1 = 10;
        int num2 = 5;
        System.out.println("(num1 > num2) && (num2 != 0): " + ((num1 > num2) && (num2 != 0))); // true
        System.out.println("(num1 < 0) || (num2 > 10): " + ((num1 < 0) || (num2 > 10))); // false

    }
}
