import java.util.Scanner;

public class sub_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(str.substring(1, str.length()-1));
    }
}
