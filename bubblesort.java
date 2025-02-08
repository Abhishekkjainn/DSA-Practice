public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 3, 4, 2, 1 };
        int[] sec = bubblesort(arr);
        for (int i = 0; i < sec.length; i++) {
            System.out.println(sec[i]);
        }
    }

    public static int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
