public class recursion {
    static int sum = 0;
    static int[] arr = { 5, 44, 1, 2, 4, 8, 6, 2 };
    static String str = "NAMAN";

    public static void revarr(int[] arr, int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(arr[n - 1]);
        revarr(arr, n - 1);
    }

    public static void checkpalindrome(String str, int n) {
        if (n >= str.length()) {
            return;
        }
        if (str.charAt(n) == str.charAt(str.length() - n - 1)) {
            System.err.println(str.charAt(n) + " Yes Correct");
        } else {
            System.out.println("Not");
        }
        checkpalindrome(str, n + 1);
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int sol = fibonacci(n - 1) + fibonacci(n - 2);
        return sol;

    }

    public static void main(String[] args) {
        int n = 10; // Example: print first 10 Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
