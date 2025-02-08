public class selectionsort2 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 7, 89, 4 };
        int[] sec = selection(arr);
        for (int i = 0; i < sec.length; i++) {
            System.out.println(sec[i]);
        }
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}