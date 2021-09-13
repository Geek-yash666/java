import java.util.Scanner;
public class indexof3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	String st1=sc.nextLine();
    int len=st1.length();
	char ch=sc.next().charAt(0);
	if(st1.indexOf(ch)==-1)
	  System.out.println("Character is Not Found");
	else if(st1.indexOf(ch,st1.indexOf(ch)+1)==-1)
	  System.out.println("Character Occurred Only Once at"+st1.indexOf(ch));
	else
    System.out.println("Character Occurred More than Once at "+st1.indexOf(ch));
	for(int j=1;j<len-1;j++){
        System.out.println("and aslo at "+(st1.indexOf(ch,st1.indexOf(ch)+j)));
        j=st1.indexOf(ch,st1.indexOf(ch)+j);
    }  
   } 
}
