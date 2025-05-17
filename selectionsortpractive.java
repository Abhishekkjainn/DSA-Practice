public class selectionsortpractive {

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minindex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minindex] = temp;
        }
        return arr;
    }

    public static int[] bubble(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void largestinanarray(int[] arr) {
        int max = 0;
        int sec = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                sec = max;
                max = arr[i];
            }
        }
        System.out.println(sec);
    }

    public static int[] removeduplicates(int[] arr) {
        int[] sec = new int[arr.length];
        int ind = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                sec[ind] = arr[i];
                ind++;
            }
        }
        return sec;
    }

    public static int[] leftrotate(int[] arr, int k) {
        // int[] sec = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // sec[i] = arr[(i + k) % arr.length];
        // }
        // return sec;
        int start = 0, end = k - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = k;
        end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        start = 0;
        end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static int[] movezeroes(int[] arr) {
        int ind = 0;
        int ind1 = 0;
        for (int i = 0; i < arr[i]; i++) {

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        System.out.println(1 % 5);
        int[] ans = new int[arr.length];
        ans = movezeroes(arr);
        largestinanarray(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
