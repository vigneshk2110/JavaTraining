public class IfElseIfElse {
    public static void main(String[] args) {
        /*
        Syntax for If Block

        if (condition1) {
            code to execute if condition1 is true
        } else if (condition2) {
            code to execute if condition1 is false and condition2 is true
        } else {
            code to execute if all conditions are false
        }    

        */

        int n = 10;

        if(n>15){
            System.out.println("N is greater than 15");
            
        }
        else if(n<=10){
            if (n< 10) {
                System.out.println("N is less than 10");
            }
            else{
                System.out.println("N is equal 10");
            }
            
        }
        else{
            System.out.println("N is NOT less than 10 & N is NOT greater than 15");
        }
    
    }
}