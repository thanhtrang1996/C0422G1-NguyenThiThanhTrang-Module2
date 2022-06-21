package ss11_map.bai_tap;

public class Product implements Comparable<Product> {

    private int id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }





    @Override
    public int compareTo(Product o) {
      if (o.getPrice() > this.getPrice()){
          return 1;
      }
      else if (o.getPrice() < this.getPrice()){
          return -1;
      }
      else return 0;
    }
}
