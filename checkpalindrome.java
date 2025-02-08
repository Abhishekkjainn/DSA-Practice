// import java.util.*;

public class checkpalindrome {
    public static void main(String[] args) {
        System.out.println(check("A man, a plan, a canal: Panama"));
    }

    public static boolean check(String str) {
        String output = "";
        String check = "";

        str = str.toLowerCase();
        int ind = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)
                    || ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57)) {
                output += str.charAt(i);
            }
            if (((int) str.charAt(ind) >= 97 && (int) str.charAt(ind) <= 122)
                    || ((int) str.charAt(ind) >= 48 && (int) str.charAt(ind) <= 57)) {
                check += str.charAt(ind);
            }
            ind++;
        }

        System.out.println(output);
        System.out.println(check);
        if (output.equals(check)) {
            return true;
        } else {
            return false;
        }

    }
}

// Most Optimised

// int left = 0, right = str.length() - 1;

// while (left < right) {
// // Move the left pointer to the next alphanumeric character
// while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
// left++;
// }
// // Move the right pointer to the previous alphanumeric character
// while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
// right--;
// }

// // Compare characters at the current positions (ignoring case)
// if (Character.toLowerCase(str.charAt(left)) !=
// Character.toLowerCase(str.charAt(right))) {
// return false; // Not a palindrome
// }

// // Move both pointers towards the center
// left++;
// right--;
// }

// return true;