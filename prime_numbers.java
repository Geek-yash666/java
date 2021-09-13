class PrimeNumbers {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 100;
        //int totals = 0;
 
        //System.out.println("List of prime numbers between " + n1 + " and " + n2);
 
        for ( int j = n1; j <= n2; j++) {
            int sqr_root = (int) Math.sqrt(j);
            boolean is_prime = true;
            for (int i = 2; i <= sqr_root; i++) {
                if (j % i == 0) {
                    is_prime = false;
                }
            }
            if (is_prime) {
                System.out.println(j);
                //totals++;
            }
        }
        //System.out.println("There are a totals of "+totals+" prime numbers between "+n1+" and "+n2);
    }
}

