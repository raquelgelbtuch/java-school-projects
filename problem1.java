import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        int x = input.nextInt();

        System.out.print("Enter a value for y: ");
        int y = input.nextInt();

        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        double average = (double) (x + y) / 2;
        int remainder = x % y;

        System.out.println("Sum of " + x + " and " + y + " : " + sum);
        System.out.println(y + " subtracted from " + x + " : " + difference);
        System.out.println("Product of " + x + " and " + y + " : " + product);
        System.out.println("Average of " + x + " and " + y + " : " + average);
        System.out.println("Remainder when " + x + " is divided by " + y + " is " + remainder);


    }
}
