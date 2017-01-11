package Euler;

public class primeFactor {
    public static void main(String[] args) 
    {
        long n= 234L; //this is a large prime number 
        long i = 2L;
        int test = 0;

        while (n > 1)
        {
            while (n % i == 0)
            {
                n /= i;     
            }

            i++;

            if(i*i > n && n > 1) 
            {
                System.out.println(n); //prints n if it's prime
                test = 1;
                break;
            }
        }

        if (test == 0)  
            System.out.println(i-1); //prints n if it's the largest prime factor
    }
}
