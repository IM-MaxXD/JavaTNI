import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int minutes = Integer.parseInt(
                JOptionPane.showInputDialog("Input minutes: "));

        int minToHour = minutes / 60;
        int finalMin = minutes % 60;


        JOptionPane.showMessageDialog(null,
                minutes + " minutes is " + minToHour + " hour " + finalMin + " minutes");



    }
}
