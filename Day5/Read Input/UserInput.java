import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Get the user's name as a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get the user's age as an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print a greeting with the user's name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        



    }

    
}