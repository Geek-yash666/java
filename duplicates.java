class Temp{
    public static void main(String[] args) {
        int []arr=new int[]{1,22,3,4,5,7,4,3};
        int ui=0;
        for(int i=0;i<10;i++){
            int flag=0;
            for(int j=0;j<ui;j++){
                if(arr[j]==arr[i]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                arr[ui]=arr[i];
                ui+=1;
            }
        for(int k=0;k<ui;k++){
            System.out.print(arr[k]);
        }
        }
    }
}

/*class C { 
    public static void main(String[] args) 
    { 
        int array[] = new int[args.length]; 
        int max=0; 
for(int i=0; i<args.length; i++) 
{ 
    array[i]=Integer.parseInt(args[i]); 
    if(max<array[i]) 
    { 
        max=array[i]; 
    } 
} 
boolean array1[] = new boolean[max+1]; 
for(int i=0; i<args.length; i++) 
{ 
    if(array1[array[i]]==false) 
    { 
        System.out.print(array[i]+" "); 
        array1[array[i]]=true; 
    } 
} 
    }}
*/