import javax.swing.JOptionPane;

public class Lab401 {
    public static void main(String[] args) {
        boolean valid = false;
        String fullName = "";

        while (!valid) {
            fullName = JOptionPane.showInputDialog(
                    null,
                    "Enter your full name:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (fullName == null) {
                return;
            }

            fullName = fullName.trim();

            String[] parts = fullName.split("\\s+");

            if (parts.length == 2) {
                valid = true;

                String firstName = parts[0];
                String lastName = parts[1];

                String formattedFirstName = firstName.toLowerCase();

                if (formattedFirstName.length() > 0) {
                    formattedFirstName = Character.toUpperCase(formattedFirstName.charAt(0)) +
                            formattedFirstName.substring(1);
                }

                String formattedLastName = lastName.toUpperCase();

                String welcomeMessage = "Welcome, " + formattedFirstName + " " + formattedLastName;

                JOptionPane.showMessageDialog(
                        null,
                        welcomeMessage,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input format. Please enter both your first name and last name.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

            }
        }
    }
}
