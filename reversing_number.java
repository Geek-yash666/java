//Write a program to reverse  a number
public class reversing_number {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]); 
        int rev = 0;  
        while(num != 0)   
        {  
         int rem = num % 10;  
         rev = rev * 10 + rem;  
         num = num/10;  
        }  
System.out.println("Reversed num is: "+rev);  
    }
}