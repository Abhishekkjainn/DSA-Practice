import java.util.Stack;

public class infixtopostfix {
    public static int pref(Character s) {
        if (s == '^') {
            return 3;
        } else if (s == '*' || s == '/') {
            return 2;
        } else if (s == '+' || s == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static int pref2(String s) {
        if (s == "^") {
            return 3;
        } else if (s == "*" || s == "/") {
            return 2;
        } else if (s == "+" || s == "-") {
            return 1;
        } else {
            return 0;
        }
    }

    public static String infixtopostfix(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                ans = ans + s.charAt(i);
            } else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans = ans + st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && pref(st.peek()) >= pref(s.charAt(i))) {
                    ans = ans + st.pop();
                }
                st.push(s.charAt(i));
            }
        }
        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }
        System.out.println(ans);
        return ans;
    }

    public static String postfixtoinfix(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String onec = st.pop();
                String twoc = st.pop();
                String res = "(" + String.valueOf(twoc) + String.valueOf(s.charAt(i)) + String.valueOf(onec) + ")";
                st.push(res);
            }
        }
        ans = ans + st.pop();
        System.out.println(ans);
        return ans;
    }

    public static String infixtoprefix(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";
        String reverseds = "";
        String actualans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                reverseds = reverseds + ')';
            } else if (s.charAt(i) == ')') {
                reverseds = reverseds + '(';
            } else {
                reverseds = reverseds + s.charAt(i);
            }
        }

        for (int i = 0; i < reverseds.length(); i++) {
            if ((reverseds.charAt(i) >= 'A' && reverseds.charAt(i) <= 'Z')
                    || (reverseds.charAt(i) >= 'a' && reverseds.charAt(i) <= 'z')
                    || (reverseds.charAt(i) >= '0' && reverseds.charAt(i) <= '9')) {
                ans = ans + String.valueOf(reverseds.charAt(i));
            } else if (reverseds.charAt(i) == '(') {
                st.push(String.valueOf(reverseds.charAt(i)));
            } else if (!st.isEmpty() && reverseds.charAt(i) == ')') {
                while (!st.isEmpty() && !st.peek().equals("(")) {
                    ans = ans + String.valueOf(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && pref2(st.peek()) >= pref(reverseds.charAt(i))) {
                    ans = ans + String.valueOf(st.pop());
                }
                st.push(String.valueOf(reverseds.charAt(i)));
            }
        }

        for (int i = ans.length() - 1; i >= 0; i--) {
            actualans = actualans + String.valueOf(ans.charAt(i));
        }

        System.out.println(actualans);
        return actualans;
    }

    public static String prefixtonfix(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String onec = st.pop();
                String twoc = st.pop();
                String res = "(" + onec + String.valueOf(s.charAt(i)) + twoc + ")";
                st.push(res);
            }
        }
        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }
        System.out.println(ans);
        return ans;
    }

    public static String prefixtopostfix(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String onec = st.pop();
                String twoc = st.pop();
                String res = onec + twoc + String.valueOf(s.charAt(i));
                st.push(res);
            }
        }

        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }
        System.out.println(ans);
        return ans;
    }

    public static String postfixtoprefix(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String onec = st.pop();
                String twoc = st.pop();
                String res = String.valueOf(s.charAt(i)) + twoc + onec;
                st.push(res);
            }
        }

        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        // prefixtonfix(infixtoprefix(postfixtoinfix(infixtopostfix("(A+B)*(C-D)"))));
        postfixtoprefix(prefixtopostfix("*-/AB+CD^EF"));
    }
}
