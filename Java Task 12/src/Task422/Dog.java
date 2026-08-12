package Task422;

public class Dog implements AnimalBehaviour {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
