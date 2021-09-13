import java.util.Scanner;
public class words_in_strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    String st1=sc.nextLine();
	    int len=st1.length();
	    int ipos=0;
	    int npos=st1.indexOf('\s');
        if(npos==-1)
        System.out.println(st1);
        else
        {
            do
            {
            if(st1.charAt(npos)=='\s'&& st1.charAt(npos-1)!='\s')
            System.out.println(st1.substring(ipos,npos));
            ipos=npos+1;
            npos=st1.indexOf('\s',npos+1);
            }while(npos!=-1);
            System.out.println(st1.substring(ipos,len));
	  }
    }
}