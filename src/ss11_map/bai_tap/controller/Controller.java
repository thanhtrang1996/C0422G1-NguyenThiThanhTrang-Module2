package ss11_map.bai_tap.controller;

import ss11_map.bai_tap.service.ProductManager;
import ss11_map.bai_tap.service.ProductService;

import java.util.Scanner;

public class Controller {
    private static ProductService productService =new ProductManager();

    public static void choose(){
        int choose;

        do{System.out.println("1. add" +
                "\n2. Edit" +
                "\n3. Delete" +
                "\n4. Read" +
                "\n5. Search" +
                "\n6. Sort" +
                "\n7. Exit");
            System.out.println("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
switch (choose){
    case 1:
        productService.addNewProduct();
        break;
    case 2:
        productService.editProduct();
        break;
    case 3:
        productService.deleteProduct();
        break;
    case 4:
        productService.readProduct();
        break;
    case 5:
        productService.searchProduct();
        break;
    case 6:
        productService.sortProduct();
        break;
    case 7:
        System.out.println("END");
        break;
    default:
        System.out.println("just choose from 1 to 7, choose again.");
}
        }
        while (choose != 7);
    }

}
