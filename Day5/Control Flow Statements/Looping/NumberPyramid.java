public class NumberPyramid {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j); // Print numbers from 1 to rows - i
            }
            System.out.println(); // Go to next line after each row
        }
    }
}