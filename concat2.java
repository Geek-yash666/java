public class concat2 {
    public static void main(String[] args) {
        String str1 ="Hello ";
        String str2=new String("Name ");
        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));
        str1=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
    }
}
