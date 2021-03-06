package ss12_linearsearch_binarysearch.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        ArrayList<Character> maxList = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(string.charAt(0));
        for (int i = 1; i < string.length() - 1; i++) {
            if (string.charAt(i + 1) <= string.charAt(i)) {
                characters.clear();
            }
            characters.add(string.charAt(i + 1));

            if (characters.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(characters);
            }
        }
        System.out.println(maxList);
    }

}

