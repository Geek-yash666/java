class Argument{
    public static void main(String args[]){
        System.out.println("Welcome "+ args[0]); //Not only Args , can be any word

        int len=args.length; //returns the len of args
        System.out.print("No. of Arguments are: " + len); //Not println

        System.out.println("Welcome "+args[0]);
        // System.out.println(args[0]+' '+args[1]);
    }
}