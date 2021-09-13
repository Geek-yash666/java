import java.util.Scanner;

public class occurence_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] nums=new int[10];
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(('0'<=str.charAt(i))&&('9'>=str.charAt(i))){
                nums[(int)str.charAt(i)-48] +=1;
            }
        }
    for(int j=0;j<10;j++){
        System.out.println("No. of "+j+" in the given string: "+nums[j]);
    }
    }
}
