import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;

        System.out.print("Input some sentence: ");
        sentence = sc.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point: ");
            sentence = sc.nextLine();
        }

        System.out.println();

        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
