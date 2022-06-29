package ss17_string.bai_tap;

import java.util.Scanner;

public class ValidateClass {
    private static final String REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class :");
        String name =scanner.nextLine();
        boolean check = name.matches(REGEX);
        if (check){
            System.out.println(name);
        }
        else System.out.println("no no");
    }
}
