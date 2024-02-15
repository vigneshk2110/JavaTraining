public class TernaryOperator{

    public static void main(String[] args) {
        int age = 18;

        // Check if adult using a ternary operator
        String message = (age >= 18) ? "You are an adult." : "You are not an adult.";
        System.out.println(message);

        // Find the larger number using a ternary operator
        int num1 = 10;
        int num2 = 20;
        int largerNumber = (num1 > num2) ? num1 : num2;
        System.out.println("The larger number is: " + largerNumber);

        // Nested ternary operator for complex logic
        double grade = 85.5;
        String letterGrade = (grade >= 90) ? "A" : ((grade >= 80) ? "B" : ((grade >= 70) ? "C" : "D"));
        System.out.println("Your letter grade is: " + letterGrade);
    }
}
