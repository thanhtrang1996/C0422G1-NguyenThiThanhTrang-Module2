package ss10_stack_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String word = scanner.nextLine();
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = word.length() - 1; i >= 0; i--) {
            queue.add(word.charAt(i));
        }
        String result = "";
        while (!queue.isEmpty()) {
            result += queue.poll();
        }
        if (result.equals(word)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
