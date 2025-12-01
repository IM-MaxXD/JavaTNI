import javax.swing.*;
import java.util.Scanner;

public class Lab302 {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your height (cm): "));
String pronoun = "";
double weight = 0;
        int optMale = JOptionPane.showInternalConfirmDialog(null,
                "Are your biological is Male?","Gender",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(optMale == JOptionPane.YES_OPTION){
            weight = height - 100;
            pronoun = "Mr.";
            JOptionPane.showMessageDialog(null,
                    "Hello, " + pronoun + name + "\nIf your height is " + height + " cm." + "\nYour weight should be " + weight + " kg.","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(optMale == JOptionPane.NO_OPTION){
            int optFemale = JOptionPane.showInternalConfirmDialog(null, "Are your biological is Female?","Gender",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(optFemale == JOptionPane.YES_OPTION){
                weight = height - 110;
                pronoun = "Ms.";
                JOptionPane.showMessageDialog(null,
                        "Hello, " + pronoun + name + "\nIf your height is " + height + " cm." + "\nYour weight should be " + weight + " kg.","Message",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(optFemale == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight and height.");

            }
        }



    };
}
