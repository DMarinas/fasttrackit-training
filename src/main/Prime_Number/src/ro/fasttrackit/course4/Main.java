package ro.fasttrackit.course4;

public class Main {

    public static void main(String[] args) {
        if (isPrime(17))
            System.out.println ("Number is prime");
        else
            System.out.println("Number is not prime");
    }
    static boolean isPrime (int n)
    {
        if (n <= 1)
            return false;
       if (n==2)
            return true;
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
