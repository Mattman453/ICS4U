package app;

public class Main {

    public static int fibonacci(int n) {
        if (n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int factorial(int n) {
        if (n>1)
            return n*factorial(n-1);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(6));
    }
}
