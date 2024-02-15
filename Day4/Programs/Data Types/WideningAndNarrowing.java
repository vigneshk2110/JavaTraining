class WideningAndNarrowing{
    public static void main(String [] args) {
    
       // Type Conversion (or) Widening  --> Implicit & Automatic 
       byte b=20;
       int i=b;    //byte to int widening
       long l=i;   //int to long widening
       double d=l; //long to double widening
       
       System.out.println("int value after widening : "+ i);
       System.out.println("long value after widening : "+ l);
       System.out.println("double value after widening : "+ d);


       // Type Casting (or) Narrowing --> explicit & Not Automatic, Manually Triggered 
       double d2 =20.5;
       byte b2 = (byte)d2;   //Narrowing double to byte
       // long ll=d2;  //compile time error, must be explicitly casted 
       long l2= (long)d2;    //Narrowing double to long
       float f2= (float)d2;  //Narrowing double to float  
       System.out.println("Narrowing double value to byte : "+ b2);
       System.out.println("Narrowing double value to long : "+ l2);
       System.out.println("Narrowing double value to float : "+ f2);
     }
   }