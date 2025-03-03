import java.util.Stack;

public class monotonicstack {
    public static int[] nextgreaterelement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static int[] nextgreaterii(int[] arr1, int[] arr2) {
        int[] ans = new int[arr2.length];
        int[] res = new int[arr1.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr2[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    res[i] = ans[j];
                }
            }
        }
        return res;
    }

    public static int[] nextgreatersecond(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = (arr.length * 2) - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i % arr.length]) {
                st.pop();
            }
            ans[i % arr.length] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i % arr.length]);
        }
        return ans;
    }

    public static int[] nearestsmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static int[] nearestsmallernew(int[] indices, int[] nums) {
        int[] ans = new int[indices.length];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = indices[i] + 1; j < nums.length; j++) {
                if (nums[indices[i]] < nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }

    public static int[] nearestsmallernewii(int[] indices, int[] arr) {
        int n = arr.length;
        int[] ans = new int[indices.length];
        int[] rightGreaterCount = new int[n]; // Stores count of greater elements to the right

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            rightGreaterCount[i] = stack.size();
            stack.push(i);
        }

        for (int i = 0; i < indices.length; i++) {
            ans[i] = rightGreaterCount[indices[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] indices = { 0, 2 };
        int[] nums = { 3 };
        int[] sec = nearestsmallernew(indices, nums);
        for (int i = 0; i < sec.length; i++) {
            System.out.println(sec[i]);
        }
    }
}
