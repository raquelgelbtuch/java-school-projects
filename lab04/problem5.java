import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = input.nextInt();

        if (month <= 7 && month % 2 == 1) {
            System.out.println("31 days");
        }
        else if (month >= 8 && month % 2 == 0){
            System.out.println("31 days");
        }
        else if (month == 4 || month == 6){
            System.out.println("30 days");
        }
        else if (month >= 9 && month % 2 == 1){
            System.out.println("30 days");
        }
        else if (month == 2){
            System.out.println("28 or 29 days");
        }
    }



    }