 class sum_of_digits{
    public static void main(String[] args) {
        int number=Integer.parseInt(args[0]); 
        int sum=0;      
        if(number != 0){
            while(number>0){
                sum = sum + number % 10;  
                number = number / 10;
            }
            System.out.println(sum); 
            
        }   
    }  
}