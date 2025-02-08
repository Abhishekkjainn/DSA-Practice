public class cubesum {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(20));
    }

    public static int sumOfSeries(int n) {
        if (n == 1) {
            return 1;
        }
        return (int) (sumOfSeries(n - 1) + Math.pow(n, 3));
    }
}
