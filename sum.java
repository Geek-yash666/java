//Write a program to find the Maximum sum by considering any 9 out of 10 values,
class sum1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int len = args.length;
        int sum =0;
        int min =Integer.MAX_VALUE;
       for(int i=0; i<len;i++)
        {
            array[i]=Integer.parseInt(args[i]);
            sum=sum+array[i];
            if (min>array[i])
                min=array[i];
        }
    System.out.println("Maximum Sum of 9 numbers is: "+(sum-min));
    }
}

