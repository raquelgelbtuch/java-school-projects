import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit integer:");
        int num = input.nextInt();

        int digit4 = num % 10;
        int digit3 = (num / 10) % 10;
        int digit2 = (num / 100) % 10;
        int digit1 = (num / 1000) % 10;

        System.out.println("Your number in reverse is " + digit4 + digit3 + digit2 + digit1);
    }
}
