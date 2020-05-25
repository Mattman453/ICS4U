package app;

public class Main {

    public static int factorial(int n) {
        if (n>1)
            return n*factorial(n-1);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
