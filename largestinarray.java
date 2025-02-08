public class largestinarray {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 2, 3, 3, 5, 8, 9, 5, 5 };
        largest(arr);
    }

    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }
}
