import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = Integer.parseInt(input.next());
        String posORneg = "";
        String oddOReven = "";
while (true) {
    if (num == 0) {
        System.out.println("This is Zero number.");break;
    }
    if (num % 2 == 0) {
        oddOReven = "Even";
        if (num < 0) {
            posORneg = "Negative";
        } else if (num > 0) {
            posORneg = "Positive";
        }
    } else if (num % 2 == 1 || num % 2 == -1) {
        oddOReven = "Odd";
        if (num < 0) {
            posORneg = "Negative";
        } else if (num > 0) {
            posORneg = "Positive";
        }

    }


    System.out.println("This number is " + oddOReven + " and " + posORneg + " number.");break;
}
    }
}
