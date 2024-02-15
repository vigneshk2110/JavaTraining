public class OverflowUnderflow{

    // public static void main(String[] args) {

    //     int maxInt = Integer.MAX_VALUE;
    //     System.out.println(maxInt + " is the Max value of primitive int data type");
    //     int minInt = Integer.MIN_VALUE;
    //     System.out.println(minInt + " is the Min value of primitive int data type");

    //     // Overflow
    //     System.out.println("Overflow:");
    //     System.out.println(maxInt - 5 + " = " + (maxInt)); // Wraps around to minimum value
    //     System.out.println(minInt - 1 + " = " + (minInt - 1)); // Wraps around to maximum value

    //     // Underflow (not applicable to integers in Java)
    //     System.out.println("Underflow Not possible");
    //     // Cannot underflow as integers represent discrete values
    // }

    
    // public static void main(String[] args) {
    //     byte maxByte = Byte.MAX_VALUE;
    //     System.out.println(maxByte + " is the Max value of primitive byte data type");
    //     byte minByte = Byte.MIN_VALUE;
    //     System.out.println(minByte + " is the Min value of primitive byte data type");

    //     // Overflow
    //     System.out.println("Overflow:");
    //     System.out.println(maxByte + 1 + " = " + (maxByte + 1)); // Becomes positive infinity
    //     System.out.println(minByte - 1 + " = " + (minByte - 1)); // Becomes negative infinity
        
    //     // Underflow (not applicable to byte in Java)
    //     System.out.println("Underflow Not possible");
    //     // Cannot underflow as byte represent discrete values

    // }
    

    /* 
    public static void main(String[] args) {
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort + " is the Max value of primitive short data type");
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort + " is the Min value of primitive short data type");

        // Overflow
        System.out.println("Overflow:");
        System.out.println(maxShort + 1 + " = " + (maxShort + 1)); // Becomes positive infinity
        System.out.println(minShort - 1 + " = " + (minShort - 1)); // Becomes negative infinity

        // Underflow (not applicable to short in Java)
        System.out.println("Underflow Not possible");
        // Cannot underflow as short represent discrete values

    }
    */

    
     
    public static void main(String[] args) {
        float maxFloat = Float.MAX_VALUE;
        System.out.println(maxFloat + " is the Max value of primitive float data type");
        float minFloat = Float.MIN_VALUE;
        System.out.println(minFloat + " is the Min value of primitive float data type");

        // Overflow
        System.out.println("Overflow:");
        System.out.println(maxFloat + 1 + " = " + (maxFloat + 1)); // Becomes positive infinity
        System.out.println(minFloat - 1 + " = " + (minFloat - 1)); // Becomes negative infinity

        // Underflow
        System.out.println("Underflow:");
        System.out.println(minFloat / 2 + " = " + (minFloat / 2)); // Becomes zero

    }
    

    /* 
    public static void main(String[] args) {
        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble + " is the Max value of primitive double data type");
        double minDouble = Double.MIN_VALUE;
        System.out.println(minDouble + " is the Min value of primitive double data type");

        // Overflow
        System.out.println("Overflow:");
        System.out.println(maxDouble + 1 + " = " + (maxDouble + 1)); // Becomes positive infinity
        System.out.println(minDouble - 1 + " = " + (minDouble - 1)); // Becomes negative infinity

        // Underflow
        System.out.println("Underflow:");
        System.out.println(minDouble / 2 + " = " + (minDouble / 2)); // Becomes zero

    }
    */


    


    
}
