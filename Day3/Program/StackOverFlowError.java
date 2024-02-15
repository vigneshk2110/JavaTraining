public class StackOverFlowError{
    public static void main(String[] args) {
        infiniteRecursion(); // Calls a function that never stops calling itself
    }

    public static void infiniteRecursion() {
        // System.out.println("I am infinite Recursion Method");
	while(true){
       		infiniteRecursion();// Keeps calling itself without a base case
		System.out.println("I am infiniteRecursion Method");
	}	
    }
}