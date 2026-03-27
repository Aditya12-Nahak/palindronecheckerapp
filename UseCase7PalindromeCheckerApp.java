import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input (optional but recommended)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Deque (Double Ended Queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);   // add to rear
        }

        // Step 2: Compare front and rear
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst(); // from front
            char rear = deque.removeLast();   // from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Output result
        if (isPalindrome) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }
}