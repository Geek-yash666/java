public class startsWith {
    public static void main(String[] args) {
        //StarsWith and endsWith are case sensitive
        String s1="Hello";
        String s3=new String("Hello");
        String s5=new String("hello");
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s3.endsWith("lo"));
    }
}
