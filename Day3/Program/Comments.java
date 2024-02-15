public class Comments{

/* Multi - line comment
         * This is main method
         * used to print hello world
         * used to calculate Area of circle
         * used to print goodbye
         */


    public static void main(String[] args) {
	    //Single Line Comment
        // This line prints "Hello, world!"
        System.out.println("Hello, world!");

        /* Multi - line comment
         * This multi-line comment explains the purpose of the next line.
         * The next line calculates the area of a circle.
         */
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);

        // This line prints a goodbye message
        System.out.println("Goodbye!");
    }
}