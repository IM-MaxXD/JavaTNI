import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();

        JOptionPane.showMessageDialog(null,"welcome to Product Stock System");

        p1.name = JOptionPane.showInputDialog("Enter product name: ");
        p1.price = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter product price: "));
        p1.quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter product stock: "));

        p1.showInfo();

        int choice = JOptionPane.showConfirmDialog(null, "Do you want to add more item?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION){
            p1.addStock(Integer.parseInt(JOptionPane.showInputDialog(null, "How many item to add in stock")));
            }
        JOptionPane.showConfirmDialog(null, "Do you want to change price?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION){
            p1.changePrice(Double.parseDouble(JOptionPane.showInputDialog(null, "How much is the new price per item?")));
        }
        p1.showInfo();
    }
}
