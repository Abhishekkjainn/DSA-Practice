public class fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(20));
    }

    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }

        // return 1;
    }
}
