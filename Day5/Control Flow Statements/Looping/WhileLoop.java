public class WhileLoop{

    public static void main(String[] args) {

        /* 
        while (condition) {
            // code to be executed repeatedly
            condition reassign 
            condition increment or decrement
        }
        */

        // Print even numbers from 0 to 10
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i); // i = 0
                 //i =1
            }
           System.out.println("Loop Print " + i );


           i++;
        }

    }
}
