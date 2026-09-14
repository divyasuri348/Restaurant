import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Did you make a reservation: (Yes/No)");
        System.out.println("What do you want to order from the menu?");
        String order = sc.nextLine();

        System.out.println("Did you make a reservation? (Yes/No)");
        String reservation = sc.nextLine();
        if (reservation.equals("Yes")) {
            System.out.println("Enter");
        }

    }
}