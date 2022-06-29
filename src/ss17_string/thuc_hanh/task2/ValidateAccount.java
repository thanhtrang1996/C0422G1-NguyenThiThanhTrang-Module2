package ss17_string.thuc_hanh.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
//    private static Pattern pattern;
//    private static Matcher matcher;
    private static final String REGEX = "^[_a-z0-9]{6,}$";

//    public  static boolean validate(String regex) {
//      boolean matcher = regex.matches(REGEX);
//     return  matcher;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ValidateAccount validateAccount = new ValidateAccount();
        System.out.print("Enter account :");
        String account = scanner.nextLine();
//        if (ValidateAccount.validate(account)) {
//            System.out.println(account +" is true");
//        }
//        else {
//            System.out.println("again");
//
        boolean check = account.matches(REGEX);
        if (check){
            System.out.println(account);
        }else {
            System.out.println("ko hop le");
        }


    }
}