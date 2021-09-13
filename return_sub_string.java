import java.util.Scanner;

public class return_sub_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        int length=line.length();
        int n=length/2;
        if (n%2==0){
            System.out.println(line.substring(n+1));
        }
        else
            System.out.println(line.substring(0,n));
    }
}
