public class equals {
    public static void main(String[] args) {
        //== it only checks for objects so even though the strings are same , it returns false in s3,s4 case

        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");
        System.out.println(s1==s2);
        //System.out.Println(s1.equals(s2));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
