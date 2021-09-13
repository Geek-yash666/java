import java.util.Scanner;

public class count_spacesandWords {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        //str=str.trim(); //to remove starting and ending spaces.
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='\s'&& str.charAt(i-1)!='\s')
            //if(str.charAt(i)=='s') for no.of spaces
                count++;
        }
    System.out.println(count);
    }
}
