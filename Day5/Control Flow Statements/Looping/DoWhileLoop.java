public class DoWhileLoop{

    public static void main(String[] args) {

        /* 
        do {
            // code to be executed repeatedly
            condition reassign 
            condition increment or decrement
        } while (condition);
        
        */

        // int j = 0;
        // do{
        //     if(j % 3 == 0){
        //     System.out.println(j);
        //     }
        //     j++;
        // }
        // while (j <= 10);


            

        // Print characters of "hello" at least once
        String word = "hello World";
        int i = 0;
        do {
            System.out.print(word.charAt(i));
            i++;
        } while (i < word.length());
    }
}
