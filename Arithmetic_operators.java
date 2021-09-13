class AOP
{
    public static void main(String args[])
    {
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);

        System.out.println("The value of A is "+a+" and B is "+b);
        System.out.println("The result of A + B is "+(a+b));
        System.out.println("The result of A - B is "+(a-b));
        System.out.println("The result of A * B is "+(a*b));
        System.out.println("The result of A / B is "+(a/(float)b));
        System.out.println("The result of A % B is "+(a%b));

    }
}