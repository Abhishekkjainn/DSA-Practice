public class findrotationk {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 10, 2, 4 };
        System.out.println(findrotated(arr));
    }

    public static int findrotated(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
