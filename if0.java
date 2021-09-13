class HomeWork {

    public static void main(String[] args) {
        
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        double interest = 0;

        if(gender == "Female" && age >= 1 && age < 58) 

            interest = 8.2;
        else if (gender == "Female" && age > 59 && age < 120)
            interest = 7.6;
        else if (gender == "Male" && age > 1 && age < 60)
            interest = 9.2;
        else if (gender == "Male" && age > 61 && age < 120)
            interest = 8.3;

            System.out.println(interest + "%");
        
    }
}
