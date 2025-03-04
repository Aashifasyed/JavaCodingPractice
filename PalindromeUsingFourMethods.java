import java.util.Scanner;
public class PalindromeUsingFourMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        boolean result1 = isPalindrome(input);
        boolean result2 = isPalindrome(new StringBuilder(input));
        boolean result3 = isPalindrome(new StringBuffer(input));
        boolean result4 = isPalindrome(input.toCharArray());
        if (result1 && result2 && result3 && result4) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
        sc.close();
    }
    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    static boolean isPalindrome(StringBuilder sb) {
        return sb.toString().equals(sb.reverse().toString());
    }
    static boolean isPalindrome(StringBuffer sb) {
        return sb.toString().equals(sb.reverse().toString());
    }
    static boolean isPalindrome(char[] chars) {
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
