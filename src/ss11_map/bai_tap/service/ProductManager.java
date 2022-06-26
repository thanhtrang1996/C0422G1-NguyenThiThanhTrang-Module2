package ss11_map.bai_tap.service;

import ss11_map.bai_tap.models.Product;
import ss11_map.bai_tap.util.Ascending;
import ss11_map.bai_tap.util.Descending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager  implements ProductService{
  private   Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> products = new ArrayList<>();
    @Override
    public void display() {
        for (Product product1:products         ) {
           System.out.println(product1);
}
    }

    @Override
    public void addNewProduct() {
        System.out.println(" 1.Add new product ");
        System.out.print("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name of product :");
        String name = scanner.nextLine();
        System.out.print("Enter price of product :");
        float price = Float.parseFloat(scanner.nextLine());
       products.add(new Product(id,name,price));
    }

    @Override
    public void editProduct() {
        System.out.println("2. Edit product");
        System.out.print("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <products.size() ; i++) {
            if(id == products.get(i).getId() ){
                System.out.println("Enter name");
                products.get(i).setName( scanner.nextLine());
                System.out.println("Enter price");
                products.get(i).setPrice( Float.parseFloat(scanner.nextLine()));
            } else{
                System.out.println("id incorrect");
            }
        }
    }


    @Override
    public void searchProduct() {
        System.out.println("Tìm kiếm sản phẩm");
        System.out.print("Nhập tên :");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (name == products.get(i).getName()){
                System.out.println(products.get(i));
            }
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("3.Delete product");
        System.out.print("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size() ; i++) {
            if (id == products.get(i).getId()){
                products.remove(i);
            }
        }
    }

    @Override
    public void sortProduct() {
        System.out.println("choose your options:" +
                "\n1. Ascending" +
                "\n2. Descending");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1 && choice != 2) {
                System.out.println("just choose 1 or 2, choose again:");
            }
        } while (choice != 1 && choice != 2);

        switch (choice) {
            case 1:
                Collections.sort(products, new Ascending());
                break;
            case 2:
                Collections.sort(products, new Descending());
                break;
        }
    }  @Override
    public void readProduct() {
        System.out.println("Show product list");
        for (Product product1:products
        ) {
            System.out.println(product1);
        }
    }

}
