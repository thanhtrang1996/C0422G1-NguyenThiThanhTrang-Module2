package ss17_string.thuc_hanh.task1;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        ValidateEmail validateEmail = new ValidateEmail();
        do {
            System.out.print("Enter email :");
            String email = scanner.nextLine();
            if (validateEmail.validate(email)) {
                System.out.println(email);
                flag = false;
            }

        } while (flag);

    }
}