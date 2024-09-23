import java.util.Scanner;
public class problem5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many 3 pointers? ");
        int three = input.nextInt();
        System.out.print("How many 2 pointers? ");
        int two = input.nextInt();

        int threePoints = three *3;
        int twoPoints = two * 2;
        int total = threePoints + twoPoints;

        System.out.print("Total points scored: " + total);

    }
}
