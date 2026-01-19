import javax.swing.JOptionPane;

public class ReturnBookTest {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", 5);
        int choice;

        while (true) {

            choice = JOptionPane.showConfirmDialog(null,
                    "Do you want to Borrow/Return book", "Borrow/Return Book",
                    JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }
            String menu = JOptionPane.showInputDialog(null,
                    "Press 1 to borrow book\nPress 2 to return book");
            if (menu == null) continue;
            if (menu.equals("1")) {
                if (book.getAvailableBook() == 0) {
                    JOptionPane.showMessageDialog(null, "No books available to borrow...",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                } else {
                    book.borrowBook();
                    System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
                }
            } else if (menu.equals("2")) {
                if (book.getTotalBook() == book.getAvailableBook()) {
                    JOptionPane.showMessageDialog(null, "Cannot return! All books are already here.");
                } else {
                    book.returnBook();
                    System.out.println("Returned 1 book, available " + book.getAvailableBook() + " books.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }
        }
    }
}
