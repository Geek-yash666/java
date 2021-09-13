//Problem: Take integer inputs until the user enters -1 or the user enter 10 prime numbers(store only primes).

import java.util.Scanner;
public class scanner_ex {
    public static void main(String[] args) {
        scanner primes=new scanner(System.in);
        int num=0;
        int[] primeno=new int[10];
        int count=0;
        do {
            num=primes.nextInt();
            //check prime
            
        }while(num!=-1 ||count==10);
        

    }
}
