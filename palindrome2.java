import java.util.Scanner;
public class palindrome2 {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str=str.toLowerCase();
        int length = str.length();
        boolean isPalindrome = true;  
        for(int first = 0; first < length/2; first++)
        {
            if(str.charAt(first) != str.charAt((length-1)-first)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("String is a palindrome.");
        }
    }
}
