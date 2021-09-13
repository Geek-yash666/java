public class compareTo {
    public static void main(String[] args) {
        // 0->if equal 
        //+ve integer for string object is greater than the argument string otherwise -ve integer.

        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");
        System.out.println(s1.compareTo(s2));
        System.out.println(s4.compareToIgnoreCase(s5));
        System.out.println(s4.compareTo(s5));//As per ascii code  'H' comes first.so -ve integer.
        System.out.println(s1.compareToIgnoreCase(s3));
    }
}
