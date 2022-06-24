package ss11_map.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
  private   Scanner scanner = new Scanner(System.in);
  private   ArrayList<Product> products = new ArrayList<>();


    public void display(){
        for (Product product1:products
             ) {
            System.out.println(product1);

        }
    }
    public void addNewProduct(){
        System.out.println(" 1.Add new product ");
        System.out.print("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name of product :");
        String name = scanner.nextLine();
        System.out.print("Enter price of product :");
        float price = Float.parseFloat(scanner.nextLine());
        Product product = new Product(id,name,price);
        products.add(product);
    }
    public void editProduct(){
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
    public void deleteProduct(){
        System.out.println("3.Delete product");
        System.out.print("Enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size() ; i++) {
            if (id == products.get(i).getId()){
                products.remove(i);
            }
        }
    }
    public  void readProduct(){
        System.out.println("Show product list");
        for (Product product1:products
             ) {
            System.out.println(product1);
        }
    }
    public void searchProduct(){
        System.out.println("Tìm kiếm sản phẩm");
        System.out.print("Nhập tên :");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (name == products.get(i).getName()){
                System.out.println(products.get(i));
            }
        }
    }
    public  void arrangementsProduct(){
        System.out.println("Sắp xếp sản phẩm");
          Collections.sort(products);
        for (Product product2:products
             ) {
            System.out.println(product2);

        }
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addNewProduct();
        productManager.display();
        productManager.editProduct();
        productManager.display();
        productManager.deleteProduct();
        productManager.display();
        productManager.readProduct();
        productManager.display();
        productManager.searchProduct();
        productManager.arrangementsProduct();
       
    }
}
