public class selectionsort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 2, 7, 89, 4 };
        int[] res = Selectionsort(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] Selectionsort(int[] arr) {
        // Loop through all array elements
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
