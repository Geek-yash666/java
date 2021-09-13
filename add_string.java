import java.util.Scanner;

public class add_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        int in=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        String st2=sc1.nextLine();
        st1=st1.substring(0,in)+st2+st1.substring(in+1, st1.length());
        System.out.println(st1);
    }
}
