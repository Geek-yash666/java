public class indexOf {
    public static void main(String[] args) {
        //check whether a char is in string retuns index(first)
        // if not occur , returns -1.
        String s1="How was your day?";//not ' ' for string
        System.out.println(s1.indexOf('t'));
        System.out.println(s1.indexOf("was"));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.indexOf('a')+1);
        System.out.println(s1.indexOf('a',(s1.indexOf('a'))+1));
        System.out.println(s1.indexOf('a',6));//after 5th index.
    }
}
