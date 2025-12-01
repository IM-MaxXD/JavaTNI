import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int fristNum = Integer.parseInt(input.next());
        System.out.print("Enter the second number: ");
        int secondNum = Integer.parseInt(input.next());

        for (int i = fristNum; i <= secondNum; i++){
            if (i % 2 == 0){
                System.out.print("" + i + " ");
            }

            
        }
    }
}
