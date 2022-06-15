package ss7_abstraction_interface.thuc_hanh.animal_interface;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck cluck cluck !";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
