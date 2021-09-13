import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//in buffer input is string only
class Bufffer{
    public static void main(String[] args) throws IOException{
        BufferedReader object =new BufferedReader(new InputStreamReader(System.in));
        //String reading= object.readLine();
        String name = object.readLine();
        int num1=Integer.parseInt(object.readLine());
        int num2=Integer.parseInt(object.readLine());
        float f1=Float.parseFloat(object.readLine());
        System.out.println(num1+num2);
    }
}