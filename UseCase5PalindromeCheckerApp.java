import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC5: Stack-Based Palindrome Checker ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Standardize input: remove spaces and convert to lowercase for accurate checking
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanInput)) {
            System.out.println("\"" + input + "\" is a palindrome. ✅");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome. ❌");
        }
        scanner.close();
    }

    /**
     * Core Logic: Using a Stack to reverse the string
     */
    public static boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        // 1. Push Operation: Put all characters into the stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // 2. Pop and Compare: Reconstruct the string in reverse order
        StringBuilder reversedText = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedText.append(stack.pop());
        }

        // 3. Reversal Logic: Compare the original clean text with the reversed version
        return text.equals(reversedText.toString());
    }
}