import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        String str1="Direct Assignment";//doesn't create new memory for same string and creates a variable.
        String str2=new String("Through objects");//creates new memory irrespective of string and creates object , stack, functions and space.
        char[] ch={'c','h','a','r'};
        String str3=new String(ch);
        Scanner sc=new Scanner(System.in);
        String str4=sc.nextLine();

        System.out.println(" ");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1.concat(str2));
        System.out.println("7th pos. in str1: "+str1.charAt(8));//character in string
        System.out.println(str1.charAt((str2.length())/2));

        System.out.println("Upper case of str1: "+ str1.toUpperCase());
        System.out.println("lower case of str1: "+ str1.toLowerCase()); 
        //original string is not modified until we allocate it to str1
        System.out.println(str2.length());
    }
}