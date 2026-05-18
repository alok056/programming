package javademo.core.oop;

public class ConstructorsDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Clean Code", "Robert Martin", 464);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    Book() {
        this("Unknown", "Unknown");
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', pages=" + pages + "}";
    }
}
