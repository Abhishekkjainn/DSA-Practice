class onetonrecursion {
    public static void main(String[] args) {
        recur(50);
    }

    public static void recur(int n) {
        int sum = 0;
        if (n <= 0) {
            return;
        }

        recur(n - 1);
        sum = sum + n;
        System.out.println(sum);
    }

}