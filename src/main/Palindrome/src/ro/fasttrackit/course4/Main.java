package ro.fasttrackit.course4;

public class Main {

    public static void main(String[] args) {
	if (palindrome(34143))
	    System.out.println("The number is palindrome");
	else
	    System.out.println("The number is not palindrome");
    }
    private static boolean palindrome (int n)
    {
        boolean palindrome=false;
        int inv=0;
        int temp=n;
        while (n>0)
        {
            int ucf=n%10;
            inv=(inv*10)+ucf;
             n/=10;
        }
        if (temp==inv)
            palindrome=true;
        else
            palindrome=false;
       return palindrome;

    }
}
