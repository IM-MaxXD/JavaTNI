import javax.swing.*;
import java.text.DecimalFormat;

public class Lab208 {
    public static void main(String[] args) {
        final double hourPrice = 50;
        final double minPrice = 0.25;
        DecimalFormat frm = new DecimalFormat("00");

        int startHours = Integer.parseInt(
                JOptionPane.showInputDialog("Input start time (hour): "));

        int startMinutes = Integer.parseInt(
                JOptionPane.showInputDialog("Input start time (minutes): "));

        int endHours = Integer.parseInt(
                JOptionPane.showInputDialog("Input end time (hour): "));

        int endMinutes = Integer.parseInt(
                JOptionPane.showInputDialog("Input end time (minutes): "));

        int startHourToMin = (startHours * 60) + startMinutes;
        int endHourToMin = (endHours * 60) + endMinutes;

        int finalHour = (endHourToMin - startHourToMin) / 60;
        int finalMin = (endHourToMin - startHourToMin) % 60;

        double totalPrice = (hourPrice * finalHour) + (minPrice * finalMin);


        JOptionPane.showMessageDialog(null,
                "Start parking at " + startHours + ":" + frm.format(startMinutes) +
                "\nEnd parking at " + endHours + ":" + frm.format(endMinutes) + "\nTotal time is " + finalHour
        + " hour " + finalMin + " minutes" + "\nParking payment is " + totalPrice + " baht.");
    }
}
