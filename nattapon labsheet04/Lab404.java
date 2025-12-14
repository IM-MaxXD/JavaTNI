import java.util.Scanner;

public class Lab404 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder collectedWords = new StringBuilder();
        String inputWord;

        System.out.println("Start entering words. Type 'stop' to finish.");

        while (true) {
            System.out.print("Enter word: ");
            inputWord = scanner.nextLine();

            if (inputWord.equalsIgnoreCase("stop")) {
                break;
            }

            collectedWords.append(inputWord.trim()).append(" ");
        }

        System.out.println(collectedWords.toString().trim());

        scanner.close();
    }
}
