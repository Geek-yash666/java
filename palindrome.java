import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
      String str,rev ="";
      Scanner s1 = new Scanner(System.in);
      System.out.println("Enter a string:");
      str = s1.nextLine();
      int len = str.length();
      for (int i=len-1;i>=0;i--)
         rev=rev+str.charAt(i);
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
    }
}
