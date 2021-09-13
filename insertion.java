public class insertion {
    public static void main(String[] args) {
        int []array=new int[]{1,2,3,4,5,6,7,8,9,-1};
        int len=array.length;
        System.out.println(len);
         int value=Integer.parseInt(args[0]);
         int pos=Integer.parseInt(args[1]);
         array[len-1]=array[pos-1];
         array[pos-1]=value;
        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }
        /*
        for(int i=len-1;i>=pos;i--){
            array[i]=array[i-1];
        }
        arr[pos-1]=value;
        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }
*/
    }
}
        
// System.out.printf("Modified arr[] : %s",Arrays.toString(arr));