package Task420;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yes or no:");
        String answer = sc.nextLine();


        if (answer.equals("yes")) {
            System.out.println("You entered yes.");
        } else if (answer.equals("no")) {
            System.out.println("You entered no.");
        } else {
            System.out.println("Invalid answer.");
        }

        sc.close();


    }
}
