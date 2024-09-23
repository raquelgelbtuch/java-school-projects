package Lab04;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the original price? ");
        double originalPrice = input.nextDouble();

        if (originalPrice >= 125) {
            double discount = originalPrice * 0.10;
            double reducedPrice = originalPrice - discount;
            System.out.println("The reduced price is: $" + reducedPrice);
        } else {
            System.out.println("That does not qualify for a discount. The price is: $" + originalPrice);
        }

    }
}