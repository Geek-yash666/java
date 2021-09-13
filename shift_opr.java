public class shift_opr {
    // only for integers.
    public static void main(String[] args) {
        int x=16;
        x=x>>3;
        System.out.println("x>>3 is:"+(x));   // >> -> used to divide a number in the multiples of 2.
            
        int y=8;
        System.out.println("y>>3 is: "+(y>>3));// << -> used to multiply a number in the multiples of 2.


        //Write a program to accept two numbers and perform
        //   1)Left shift the first number by second number of times.
        //   2)Right Shift the first number by second number of times.
         
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("a<<b is: "+(a<<b));
        System.out.println("a>>b is: "+(a>>b));
    }
}
