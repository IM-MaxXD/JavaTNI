import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat(".00");
        double weight = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your weight (kg.): "));
        int height = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your height (cm.): "));

        double heightM = height / 100.0;
        double bmi = weight / (heightM * heightM);
        String result = "";
        if (bmi < 18.5){
            result = "Underweight";
        } else if (bmi >= 18.5&&bmi <= 24.9) {
            result = "Healthy Weight";
        } else if (bmi >= 25&&bmi <= 29.9) {
            result = "Over weight";
        } else if (bmi >= 30) {
            result = "Obese";
        }
        JOptionPane.showMessageDialog(null,"Your BMI is " + frm.format(bmi) + "\nBMI result is " + result ,"Message",JOptionPane.INFORMATION_MESSAGE);
    }
}
