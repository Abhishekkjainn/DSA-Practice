public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 20, 4, 5, 9, 31, 4, 52, 1, 7, 5, 6, 5 };
        int[] sec = insertion(arr);

        for (int i = 0; i < sec.length; i++) {
            System.out.println(sec[i]);
        }
    }

    public static int[] insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
