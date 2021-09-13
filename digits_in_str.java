import java.util.Scanner;
public class digits_in_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int count=0;
        int alpha=0;
        int C_Alpha=0;
        int sp=0;
        int len=str1.length();
        for(int i=0;i<len;i++){
            if (str1.charAt(i)>='0' && str1.charAt(i)<='9')
                count=count+1;
            else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
                alpha=alpha+1;
            else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
                C_Alpha=C_Alpha+1;
            else
                sp=sp+1;
        }
            
        System.out.println("No.of digits are: "+ count);
        System.out.println("No.of lower cases are: "+alpha);
        System.out.println("NO.of upper cases are: "+C_Alpha);
        System.out.println("No.of special chars are: "+sp);
    } 
}
