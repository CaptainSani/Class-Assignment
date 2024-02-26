package Week5.ClassActivity_4a.class_excercise;

public class Book {
    private int id;
    private String bookTitle;
    private String bookAuthor;
    private int bookQuantity;

    public Book(int id, String bookTitle, String bookAuthor, int bookQuantity) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
    }

    public int getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookQuantity=" + bookQuantity +
                '}';
    }
}
