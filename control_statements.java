public class control_statements {
    public static void main(String[] args) {
        // if, if else, switch  -->  Selection or decision making or branch statements.
        // while, for, do-while -->  Iteration statements.
        // break, continue, return  --> Jumping statements.

    int age=Integer.parseInt(args[0]);
    if (age>18)
    {
        System.out.println("You are eligible for vote");
    }
    else{
        System.out.println("You are not eligible for vote");
    }


    //Switch cases:
    int weekday =Integer.parseInt(args[0]);
    switch(weekday){
        case 1:System.out.println("Sunday");
        break;
        case 2:System.out.println("Monday");
        break;
        default:System.out.println("Invalid day");
    }

    }
}
