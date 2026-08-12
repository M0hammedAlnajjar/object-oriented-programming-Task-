package Task419;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car car = new Car();

        System.out.println("Enter car colour:");
        car.colour = sc.nextLine();

        System.out.println("Enter plate:");
        car.plate = sc.nextLine();

        sc.close();

    }
}
