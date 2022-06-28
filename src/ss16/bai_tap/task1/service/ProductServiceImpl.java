package ss16.bai_tap.task1.service;

import ss16.bai_tap.task1.models.Product;
import ss16.bai_tap.task1.util.ReadAndWriteProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService{
    List<Product> products = new ArrayList<>();
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Code :");
        String code = scanner.nextLine();
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.print("Enter Manufacturer :");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter Price :");
        float price = Float.parseFloat(scanner.nextLine());
        products.add(new Product(id,code, name,manufacturer,price));
        ReadAndWriteProduct.writeToObject("src/ss16/bai_tap/task1/data/product.csv",products);

    }

    @Override
    public void display() {
        products = ReadAndWriteProduct.readDataFromFile("src/ss16/bai_tap/task1/data/product.csv");
        System.out.println("DISPLAY");
        for (Product product:products
             ) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        products = ReadAndWriteProduct.readDataFromFile("src/ss16/bai_tap/task1/data/product.csv");
        System.out.println(" SEARCH PRODUCT ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name :");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (name == products.get(i).getName()){

        } System.out.println("Display "+ products.get(i).getName()) ;
            }

        }

    @Override
    public void delete() {
        products = ReadAndWriteProduct.readDataFromFile("src/ss16/bai_tap/task1/data/product.csv");
        System.out.println("DELETE");
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter Id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){

            } System.out.println("Display "+ products.get(i).getId()) ;
        }

    }
}
