public class max_min {
    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        int[] arr = new int[10];
        int len=args.length;
        for(int i=0;i<len;i++)
            arr[i]=Integer.parseInt(args[i]);
        int max =Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int j=0;j<len;j++)
        {
            if(arr[j]>max)
                max=arr[j];
            if(arr[j]<min)
                min=arr[j];
        }
    System.out.println("Max value is: "+max);
    System.out.println("Min value is: "+min);
    }
}