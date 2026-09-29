import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the fruit");
        String fruit = input.next();

        switch (fruit) {
            case "Apple":
                System.out.println("Keeps the doctor away");
                break;
            
            case "Orange":
                System.out.println("Citrusly");
                break;
            
            case "Pineapple":
                System.out.println("Creed Aventus");
                break;

            default:
                System.out.println("Buy Whiskey Smoke");
        }
    }
}