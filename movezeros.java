public class movezeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int[] sec = move(arr);
        for (int num : sec) {
            System.out.print(num);
        }
    }

    public static int[] move(int[] arr) {
        // int firstzeroind = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // firstzeroind = i;
        // break;
        // }
        // }
        // for (int i = firstzeroind; i < arr.length - 1; i++) {
        // if (arr[i + 1] != 0) {
        // while (arr[i + 1] != 0) {
        // int temp = arr[i + 1];
        // arr[i + 1] = arr[i];
        // arr[i] = temp;
        // }
        // } else {
        // continue;
        // }

        // }
        int nonzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonzero];
                arr[nonzero] = temp;
                nonzero++;
            }
        }
        return arr;
    }
}
