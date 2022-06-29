package ss17_string.bai_tap;

import java.util.Scanner;

public class Telephone {
    public static final String REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter telephone :");
        String telephone =scanner.nextLine();
        boolean check = telephone.matches(REGEX);
        if (check){
            System.out.println(telephone);
        }
        else System.out.println("no no");
    }
    }

