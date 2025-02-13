public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 3, 4, 2, 1 };
        int[] sec = Bubblesort(arr);
        for (int i = 0; i < sec.length; i++) {
            System.out.print(sec[i] + " ");
        }
    }

    public static int[] Bubblesort(int[] arr) {
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
