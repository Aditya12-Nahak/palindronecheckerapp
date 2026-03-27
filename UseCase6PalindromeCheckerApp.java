import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces (optional improvement)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Step 1: Insert into Queue and Stack
        for (char ch : input.toCharArray()) {
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        // Step 2: Compare dequeue vs pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if (fromQueue != fromStack) {
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