public class AssignmentOperators{

    public static void main(String[] args) {

        int num = 10;
        // Simple assignment
        num = 20; // Assigns 20 to num

        System.out.println("After simple assignment: " + num);

          // Combined assignment operators

        num += 5; // Equivalent to num = num + 5 
        System.out.println("After +=: " + num);

        num -= 3; // Equivalent to num = num - 3
        System.out.println("After -=: " + num);

        num *= 2; // Equivalent to num = num * 2
        System.out.println("After *=: " + num);

        num /= 4; // Equivalent to num = num / 4 (integer division)
        System.out.println("After /=: " + num);

        num %= 3; // Equivalent to num = num % 3 (remainder after division)
        System.out.println("After %=: " + num);

	//post increment Operator
	num++; // num = num +`1;
System.out.println(num);
	num++; // num = num +`1;
System.out.println(num);
	//increment Operator
	num++; // num = num +`1;
System.out.println(num);
	num++; // num = num +`1;
System.out.println(num);

//pre increment Operator
	++num; // num = num +`1;
System.out.println(num);
	++num; // num = num +`1;
System.out.println(num);
	//increment Operator
	++num; // num = num +`1;
System.out.println(num);
	++num; // num = num +`1;
System.out.println(num);



	

        // Bitwise and shift assignment operators (less commonly used)
        // num &= 7; // Equivalent to num = num & 7 (bitwise AND)
        // num <<= 2; // Equivalent to num = num << 2 (left shift)
        // num >>= 1; // Equivalent to num = num >> 1 (right shift)

        // Note: Bitwise and shift assignment operators are not covered here
        // for simplicity, but you can explore them further if needed.
    }
}
