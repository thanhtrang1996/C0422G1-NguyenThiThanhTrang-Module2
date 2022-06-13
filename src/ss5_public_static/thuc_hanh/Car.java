package ss5_public_static.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String name,String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;

    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Mazda 9","Skyactiv 9");
        System.out.println(Car.numberOfCar);
    }

}
