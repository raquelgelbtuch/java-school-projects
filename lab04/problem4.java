package Lab04;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        }
        else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither");
        }

    }
}