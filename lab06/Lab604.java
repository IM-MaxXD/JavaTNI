import java.util.Scanner;

public class Lab604 {

    public static void main(String[] args) {

        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};

        display_array(numbers);

        int index = input_index(numbers);

        System.out.println();

        System.out.println("The number at index " + index + " is " + numbers[index]);

        System.out.print("The number before index " + index + " is ");
        if (check_index(numbers, index - 1)) {
            System.out.println(numbers[index - 1]);
        } else {
            System.out.println("Out of range!!");
        }

        System.out.print("The number after  index " + index + " is ");
        if (check_index(numbers, index + 1)) {
            System.out.println(numbers[index + 1]);
        } else {
            System.out.println("Out of range!!");
        }
    }

    public static void display_array(int[] numbers) {
        System.out.print("List of numbers in array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int input_index(int[] numbers) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter index: ");
        int idx = scan.nextInt();

        while (!check_index(numbers, idx)) {
            System.out.print("Invalid index!! Enter index, again: ");
            idx = scan.nextInt();
        }
        return idx;
    }

    public static boolean check_index(int[] numbers, int index) {
        return (index >= 0 && index < numbers.length);
    }
}
