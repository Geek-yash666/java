//Write a program to find first and second max and min
public class sum_min_max {
    public static void main(String[] args) {
        int[] array = new int[10];
        int len = args.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
 /*      for(int i=0; i<len;i++)
        {
            array[i]=Integer.parseInt(args[i]);
            sum=sum+array[i];
            if(max<array[i])
                max=array[i];
            if(secondmax<array[i] && array[i]!=max)
                secondmax=array[i];
            if (min>array[i])
                min=array[i];
            if(secondmin>array[i] && array[i]!=min)
                secondmin=array[i];
        }
    System.out.println("Sum is: "+sum);
    System.out.println("Maxis: "+max);
    System.out.println("Min is: "+min);
    }
}*/
        
        for(int i=0; i<len;i++)
            array[i]=Integer.parseInt(args[i]);
        int max2=array[0];
        int min2=array[0];
        int c1=0;
        int c2=0;
        for (int i=0;i<len;i++)
        {
            if(array[i]>max)
            {
                max2=max;
                max=array[i];
                c1=i;
            }
            if(array[i]<min)
            {
                min2=min;
                min=array[i];
                c2=i;
            }
        }
        for(int i=c1;i<len;i++)
        {
            if(array[i]>max2 && array[i]!=max)
            {
                max2=array[i];
            }
        }
        for(int j=c2;j<len;j++)
        {
            if(array[j]<min2 && array[j]!=min)
            {
                min2=array[j];
            }
        } 
        System.out.println("1st max = "+max+" and "+"2nd max = "+max2);
        System.out.println("1st min = "+min+" and "+"2nd min = "+min2);
    }
}