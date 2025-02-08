class sumofdiv {
    public static void main(String[] args) {
        checksum(1);
    }

    public static void checksum(int n) {
        int sum = 0;
        int start = 1;
        for (int i = 1; i <= n; i++) {
            while (start <= i) {
                if (i % start == 0) {
                    sum = sum + start;
                }
                start++;
            }
            start = 1;
        }
        System.out.println(sum);
    }
}