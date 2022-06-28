package ss16.bai_tap.task1.controller;

import ss16.bai_tap.task1.service.ProductService;
import ss16.bai_tap.task1.service.ProductServiceImpl;

import java.util.Scanner;

public class Control {
    private static ProductService productService = new ProductServiceImpl();

    public static void displayMenu() {
        int choose;
        do {
            System.out.println("MENU" +
                    "\n 1.Add new product" +
                    "\n 2. Display product" +
                    "\n 3. Delete product" +
                    "\n 4. Search product" +
                    "\n 5. Exit");
            System.out.println("Enter choose");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    productService.search();
                    break;
                case 5:
                    System.out.println("End");
                    break;
                default:
                    System.out.println("just choose from 1 to 5, choose again.");
            }

        } while (choose != 5);
    }
}
