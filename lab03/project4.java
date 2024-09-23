import java.util.Scanner;
public class problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();


        System.out.println("Enter your height in inches:");
        int height = input.nextInt();

        double heightInCent = height * 2.54;

        System.out.println("Hi " + name + ". You are " + heightInCent + " centimeters tall.");


    }
}
