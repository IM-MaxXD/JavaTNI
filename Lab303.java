import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;

        System.out.print("Enter the value for x coordinate: ");
        x = Integer.parseInt(input.next());

        System.out.print("Enter the value for y coordinate: ");
        y = Integer.parseInt(input.next());

        String quadrant = "";

        if (x > 0 && y > 0) quadrant = "the first quadrant";
        if (x < 0 && y > 0) quadrant = "the second quadrant";
        if (x < 0 && y < 0) quadrant = "the third quadrant";
        if (x > 0 && y < 0) quadrant = "the fourth quadrant";
        if (x == 0 && y == 0) quadrant = "the origin";

        System.out.println("The coordinete point (" + x + "," + y + ") lies in " + quadrant);
    }
}
