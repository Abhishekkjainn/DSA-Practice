public class reversearray {
    public static void main(String[] args) {
        int[] trying = { 1 };
        int[] rev = reverseArray(trying, 0, trying.length - 1);

        for (int i = 0; i < rev.length; i++) {
            System.out.println(rev[i]);
        }
    }

    public static int[] reverseArray(int arr[], int start, int end) {
        if (start >= end) {
            return arr;
        } else {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
        return arr;
    }
}
