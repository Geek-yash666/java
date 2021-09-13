import java.io.InputStream;
import java.util.Scanner;

public class scanner {
    public scanner(InputStream in) {
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name age salary:");
        String name = myObj.nextLine();
        int age =myObj.nextInt();
        double salary = myObj.nextDouble();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary: "+salary);
    }

    public int nextInt() {
        return 0;
    }
}
//nextBoolean() - > reads a boolean value
//nextByte(),nextDouble(),nextFloat(),nextInt(),nextLine()->string,nextLong(),nextShort().