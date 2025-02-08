public class rotatebyright {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] sec = rotateright(arr, 2);
        for (int num : sec) {
            System.out.print(num);
        }
    }

    public static int[] rotateright(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Fix 1: Adjust k if it's greater than n

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);

        return nums;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
