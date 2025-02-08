public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 28078, 19451, 935, 28892, 2242, 3570, 5480, 231 };
        System.out.println(secondlargest(arr));
    }

    public static int secondlargest(int[] arr) {
        int secondlargest = Integer.MIN_VALUE;
        int largest = arr[0];
        if (arr.length <= 1) {
            return arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == largest) {
        // continue;
        // } else {
        // if (arr[i] > secondlargest) {
        // secondlargest = arr[i];
        // }
        // }
        // }
        return secondlargest;
    }
}
