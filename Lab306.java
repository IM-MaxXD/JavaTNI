import javax.swing.*;

public class Lab306 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer number: "));
        int sum = 0;
        for (int i = 1; i <= num; i++){
             sum += i;
        }
        JOptionPane.showMessageDialog(null, "Summation of 1 to " + num + " is " + sum);
    }
}
