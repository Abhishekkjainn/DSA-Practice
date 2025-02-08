public class removeduplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int uniqueCount = removeDuplicates(arr);
        

        // Printing the modified array with unique elements
       
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0; // No elements to process
        }

        int uniqueIndex = 1; // Index to track position of next unique element

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // If current element is different from previous
                arr[uniqueIndex] = arr[i]; // Place it at the uniqueIndex position
                uniqueIndex++; // Increment uniqueIndex to track the next unique position
            }
        }

        // Return the count of unique elements
        return uniqueIndex;
    }
}
