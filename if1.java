public class if1 {
    public static void main(String[] args) {
        char c1='A';
        char c2='s';
        if(c1<'a'){
            int i1=c1+32;
            c1=(char)i1;
        }
        if(c2<'a'){
            int i2=c2+32;
            c2=(char)i2;
        }
          
        // if((int)c1>=65 && (int)c1<=91)
        //if (c1>='A' && c2<='Z')
        if (c1<c2)
            System.out.println(c1 +","+ c2);
        else
            System.out.println(c2 +","+ c1);  
    }
}
