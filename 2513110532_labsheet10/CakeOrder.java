import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday Cake's Detaile:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor  : ");
        String flavor = scanner.next();
        System.out.print("How many pounds : ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);

        System.out.println(order1);
        System.out.println();
        System.out.println();

        System.out.println("Cup Cake's Detaile:");
        System.out.print("Enter a flavor  : ");
        flavor = scanner.next();
        System.out.print("How many piece  : ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece,flavor,65);

        System.out.println(order2);
        System.out.println();


        System.out.println("ChouxCream's Detaile:");
        System.out.print("Enter a cream flavor  : ");
        String Cream = scanner.next();
        System.out.print("How many box (Get -50% discount when ordering two or more boxes) : ");
        int box = scanner.nextInt();


        ChouxCream order3 = new ChouxCream(box,Cream,39);
        System.out.println(order3);
        System.out.println();

        System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice()));
    }
}
