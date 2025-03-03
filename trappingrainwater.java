import java.util.*;

public class trappingrainwater {
    public static int trappingraini(int[] arr) {
        int area = 0;
        int[] ansleft = getleftmax(arr, 0);
        int[] ansright = getrightmax(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            int leftmax = ansleft[i];
            int rightmax = ansright[i];
            if (arr[i] < leftmax && arr[i] < rightmax) {
                area = area + ((leftmax < rightmax) ? (leftmax - arr[i]) : (rightmax - arr[i]));
            }
        }
        return area;
    }

    public static int[] getleftmax(int[] arr, int ind) {
        int max = -1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            ans[i] = max;
        }
        return ans;
    }

    public static int[] getrightmax(int[] arr, int ind) {
        int max = -1;
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
            ans[i] = max;
        }
        return ans;
    }

    public static int trap(int[] arr) {
        int lmax = 0;
        int rmax = 0;
        int total = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] <= arr[r]) {
                if (lmax > arr[l]) {
                    total = total + lmax - arr[l];
                } else {
                    lmax = arr[l];

                }
                l = l + 1;
            } else {
                if (rmax > arr[r]) {
                    total = total + rmax - arr[r];
                } else {
                    rmax = arr[r];

                }
                r = r - 1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(arr));
        // int[] sec = getrightmax(arr, 0);
        // for (int i = 0; i < sec.length; i++) {
        // System.out.println(sec[i]);
        // }
    }
}
