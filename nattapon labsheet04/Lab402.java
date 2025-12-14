import javax.swing.JOptionPane;

public class Lab402 {

    public static void main(String[] args) {
        String studentId = "";
        boolean valid = false;

        while (!valid) {
            studentId = JOptionPane.showInputDialog(
                    null,
                    "Enter student-id:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (studentId == null) {
                return;
            }

            studentId = studentId.trim();

            if (studentId.length() == 10) {
                valid = true;
            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Invalid Student ID length. Please enter a 10-digit ID.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        String majorCode = studentId.substring(2, 5);
        String majorName;

        switch (majorCode) {
            case "131":
                majorName = "Information Technology (IT)";
                break;
            case "132":
                majorName = "Multimedia Technology (MT)";
                break;
            case "133":
                majorName = "Digital Business Information Technology (BI)";
                break;
            case "134":
                majorName = "Digital Technology in Mass Communication (DC)";
                break;
            case "135":
                majorName = "Data Science and Data Analytics (DS)";
                break;
            default:
                majorName = "Cannot found major";
                break;
        }

        String outputMessage = "Student ID: " + studentId + "\n" +
                "Major: " + majorName;

        JOptionPane.showMessageDialog(
                null,
                outputMessage,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
