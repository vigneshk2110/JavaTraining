public class BitWiseOperators {

    public static void main(String[] args) {
        int num1 = 10; // Binary representation: 1010
        int num2 = 5; // Binary representation: 0101

        // Bitwise AND (&)
        System.out.println("num1 & num2: " + (num1 & num2)); // 0 (only rightmost 1 overlaps)

        // Bitwise OR (|)
        System.out.println("num1 | num2: " + (num1 | num2)); // 15 (combines all 1s)

        // Bitwise XOR (^)
        System.out.println("num1 ^ num2: " + (num1 ^ num2)); // 15 (flips bits where different)

        // Bitwise NOT (~)
        System.out.println("~num1: " + (~num1)); // -11 (flips all bits and adds 1)

        // Left shift (<<)
        System.out.println("num1 << 1: " + (num1 << 1)); // 20 (shifts bits left by 1, adds 0 on right)

        // Right shift (>>)
        System.out.println("num2 >> 1: " + (num2 >> 1)); // 2 (shifts bits right by 1, discards leftmost bit)

        // Unsigned right shift (>>>) (for positive numbers)
        System.out.println("num2 >>> 1: " + (num2 >>> 1)); // 2 (similar to right shift, but keeps leftmost bit as 0)

        // Note: More advanced bitwise operators like bitwise complements exist,
        // but they are less commonly used and can be explored further if needed.
    }
}
