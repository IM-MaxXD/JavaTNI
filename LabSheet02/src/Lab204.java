import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input hour : ");
        String hourStr = scan.next();
        int hour = Integer.parseInt(hourStr);

        System.out.print("Input minute: ");
        String minStr = scan.next();
        int min = Integer.parseInt(minStr);

        int totalTime = (hour * 60) + min;
        System.out.println("Total time is " + totalTime + " minutes");
    }
}
