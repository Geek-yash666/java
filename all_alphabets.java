class alpha{
    public static void main(String[] args) {
            String str=new String("Farmer jack realized that big yellow quilts were expensive");
            int[] b=new int[26];
            int count=0;
            //for(int i=0;i<26;i++)
            //    System.out.print(b[i]+ " ");
            //    System.out.println(",");
            //boolean[] b=new boolean[26];
            int len=str.length();
            for(int i=0;i<len;i++){
                char ch=str.charAt(i);
                if(ch>='a' && ch<='z'){
                    //System.out.println((int)(ch-'a'));
                    b[(int)(ch-'a')]=1;
                    //b[(int)(ch-'a')]=+1;
                }
                else if(ch>='A' && ch<='Z'){
                    //System.out.println((int) (ch-'A')); //Returns index
                    b[(int)(ch-'A')]=1;
                    //b[(int)(ch-'a')]=b[(int)(ch-'a')]+1;//returns no.of occurences.
                }
            }
            //System.out.println(",");
            for(int i=0;i<26;i++){
                if(b[i]==1)
                    count++;
                //  System.out.print(b[i]+ " ");
            }
            //System.out.print(count);
            if(count ==26)
                System.out.println("All alphabets are present");
            else    
                System.out.println("All alphabets are not present");
    }
}