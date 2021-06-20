package ro.fasttrackit.course4;

public class Main {

    public static void main(String[] args) {
        int result=factorial(6);
        System.out.println(result);
    }
    private static int factorial (int n) {
        int p=1;
        for (int i = 1; i <= n; i++)
            p = p * i;
        return p;
    }
}

