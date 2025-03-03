import java.util.Stack;

class pair {
    int min;
    int val;

    pair(int min, int val) {
        this.min = min;
        this.val = val;
    }
}

public class minstack {
    static Stack<pair> st = new Stack<>();

    public static int mini(int onenum, int twonum) {
        if (onenum <= twonum) {
            return onenum;
        } else {
            return twonum;
        }
    }

    public static void minstack() {
        System.out.println("Testing Min Stack Operations...");

        push(5);
        System.out.println("Pushed 5, Min: " + getMin()); // Expected: 5

        push(2);
        System.out.println("Pushed 2, Min: " + getMin()); // Expected: 2

        push(8);
        System.out.println("Pushed 8, Min: " + getMin()); // Expected: 2

        push(1);
        System.out.println("Pushed 1, Min: " + getMin()); // Expected: 1

        System.out.println("Top Element: " + peek()); // Expected: 1

        pop();
        System.out.println("Popped, Min: " + getMin()); // Expected: 2

        pop();
        System.out.println("Popped, Min: " + getMin()); // Expected: 2

        pop();
        System.out.println("Popped, Min: " + getMin()); // Expected: 5

        pop();
        System.out.println("Popped, Stack is now empty.");

        // Edge case: Popping from an empty stack
        try {
            pop();
        } catch (Exception e) {
            System.out.println("Error: Cannot pop from an empty stack.");
        }

        // Edge case: Getting min from an empty stack
        try {
            System.out.println("Min: " + getMin());
        } catch (Exception e) {
            System.out.println("Error: Cannot get min from an empty stack.");
        }
    }

    public static void push(int val) {
        if (st.isEmpty()) {
            pair p = new pair(val, val);
            st.push(p);
        } else {
            pair p = new pair(val, mini(val, st.pop().min));
            st.push(p);
        }
    }

    public static void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public static int peek() {
        return st.peek().val;
    }

    public static int getMin() {
        return st.peek().min;
    }

    public static void main(String[] args) {
        minstack();
    }
}
