public class IfElseIf{
    public static void main(String[] args) {
        /*
        Syntax for If Block

        if (condition1) {
            code to execute if condition1 is true
        } else if (condition2) {
            code to execute if condition1 is false and condition2 is true
        }      

        */

        int n = 10;

        if(n>15){
            System.out.println("N is greater than 15");
        }
        else if(n<10){
            System.out.println("N is less than 10");
        }

        System.out.println("End of the Program");
    
    }
}