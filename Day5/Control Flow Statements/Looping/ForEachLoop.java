public class ForEachLoop{

    public static void main(String[] args) {

        /*
        for (dataType item : collection) {
            code to be executed for each item in the collection
        }
         */

        // Print elements of an array
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Print elements of an array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}