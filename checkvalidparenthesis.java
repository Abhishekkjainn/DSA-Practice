import java.util.*;

public class checkvalidparenthesis {
    public static boolean checkvalidparenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (st.isEmpty()) {
                    return false;
                }
                Character str = st.pop();
                if ((s.charAt(i) == ')' && str != '(') || (s.charAt(i) == ']' && str != '[')
                        || (s.charAt(i) == '}' && str != '{')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> bracketMap = Map.of(')', '(', ']', '[', '}', '{');

        for (char ch : s.toCharArray()) {
            if (bracketMap.containsKey(ch)) { // If it's a closing bracket
                if (st.isEmpty() || st.pop() != bracketMap.get(ch)) {
                    return false;
                }
            } else { // If it's an opening bracket
                st.push(ch);
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkvalidparenthesis("(]"));
    }
}
