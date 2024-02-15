public class TypeCasting{

    public static void main(String[] args) {

        // Automatic conversion & casting
        int age = 25;
        double height = 1.75; // Implicit conversion from int to double (widening)
        int roundedHeight = (int) height; // Explicit conversion from double to int (narrowing)

        // String conversion
        String ageString = String.valueOf(age);
        int parsedAge = Integer.parseInt(ageString);

        System.out.println("Age (int): " + age);
        System.out.println("Height (double): " + height);
        System.out.println("Rounded height (int): " + roundedHeight); // May print 1
        System.out.println("Age as string: " + ageString);
        System.out.println("Parsed age from string: " + parsedAge);
    }
}
