package Lab04;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the item's original price? ");
        double originalPrice = input.nextDouble();

        double discountPercentage;
        double discountedPrice;

        if (originalPrice <= 100) {
            discountPercentage = 20;
            discountedPrice = originalPrice - (originalPrice * 0.20);
            System.out.println("The item qualifies for a 20% discount. The item's discounted price is " + discountedPrice + ".");
        } else {
            discountPercentage = 40;
            discountedPrice = originalPrice - (originalPrice * 0.40);
            System.out.println("The item qualifies for a 40% discount. The item's discounted price is " + discountedPrice + ".");
        }

    }
}
