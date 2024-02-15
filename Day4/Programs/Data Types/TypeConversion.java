public class TypeConversion{

    public static void main(String[] args) {

        // Automatic conversion (widening) from smaller to larger types
        byte myByte = 127;
        short myShort = myByte; // Implicit conversion from byte to short
        int myInt = myShort; // Implicit conversion from short to int
        long myLong = myInt; // Implicit conversion from int to long
        float myFloat = myLong; // Implicit conversion from long to float
        double myDouble = myFloat; // Implicit conversion from float to double

        System.out.println("Original byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " " + myFloat);
        System.out.println("Double value: " + myDouble);
    }
}
