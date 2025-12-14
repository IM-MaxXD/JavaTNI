import javax.swing.JOptionPane;

public class Lab403 {

    private static final String CORRECT_USERNAME = "Admin";
    private static final String CORRECT_PASSWORD = "admin1234";

    public static void main(String[] args) {

        boolean loginSuccess = false;

        while (!loginSuccess) {

            String inputUsername = JOptionPane.showInputDialog(
                    null,
                    "Enter username:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (inputUsername == null) {
                return;
            }
            inputUsername = inputUsername.trim();

            String inputPassword = JOptionPane.showInputDialog(
                    null,
                    "Enter password:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (inputPassword == null) {
                return;
            }

            boolean usernameMatch = inputUsername.equalsIgnoreCase(CORRECT_USERNAME);

            boolean passwordMatch = inputPassword.equals(CORRECT_PASSWORD);

            if (usernameMatch && passwordMatch) {
                loginSuccess = true;
                JOptionPane.showMessageDialog(
                        null,
                        "Login Success!!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Incorrect username or password\n\nLogin Fail...",
                        "Login Fail...",
                        JOptionPane.ERROR_MESSAGE
                );

            }
        }
    }
}
