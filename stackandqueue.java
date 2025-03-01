import java.util.*;

public class stackandqueue {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(45);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class stackimp {
    static int top = -1;
    static int stacksize = 10;
    static int[] stack = new int[10];

    public static void push(int x) {
        top++;
        stack[top] = x;
    }

    public static void pop(int x) {
        // stack[top] = -1;
        top--;
    }

    public static int top() {
        if (top == -1) {
            return -1;
        }
        return stack[top];
    }

    public static int size() {
        return top + 1;
    }
}
