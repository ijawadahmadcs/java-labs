class Book {
    String title;
    Book(String t) { title = t; }
}

public class Example3 {
    static void printBooks(Book[] books) {
        for (Book b : books) {
            System.out.println("Book: " + b.title);
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics"),
            new Book("OOP in Java"),
            new Book("Advanced Java")
        };

        printBooks(books); // passing array to method
    }
}
