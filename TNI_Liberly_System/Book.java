import java.util.LinkedList;
import java.util.Queue;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    private Queue<String> reservationQueue;

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.reservationQueue = new LinkedList<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void addReservation(String userName) {
        reservationQueue.offer(userName);
        System.out.println(">> เพิ่มคุณ '" + userName + "' เข้าคิวจองหนังสือ '" + title + "' สำเร็จ");
    }

    public String getNextReservation() {
        return reservationQueue.poll();
    }

    @Override
    public String toString() {
        String status = isAvailable ? "[ว่าง]" : "[มีคนยืมแล้ว]";
        return status + " รหัส: " + isbn + " | ชื่อเรื่อง: " + title + " | ผู้แต่ง: " + author;
    }
}