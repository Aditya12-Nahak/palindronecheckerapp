public class palindronechecker {
    public static void main(String[] args) {
      
        
        System.out.println("polindrone checker app");
        System.out.println(" version 1.0");
        System.out.println("system initialized");
        
        // Hardcoded input
        String word = "madam";

        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        
        if (word.equals(reversed)) {
            System.out.println("Yes its a palindrome");
        } else {
            System.out.println("No its not a palindrome");
        }
    }



    }



