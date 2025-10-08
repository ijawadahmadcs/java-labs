class Book {
    // 🔒 Encapsulated (private) data members
    private String author;
    private String[] chapterNames;

    // 1. No-argument constructor
    Book() {
        author = "Unknown";
        chapterNames = new String[0]; // empty array
    }

    // 2. Two-argument constructor
    Book(String author, String[] chapters) {
        this.author = author;
        this.chapterNames = chapters;
    }

    // Getter and Setter methods
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    // Compare authors of two books
    public static boolean compareBooks(Book b1, Book b2) {
        return b1.author.equalsIgnoreCase(b2.author);
    }

    // Compare number of chapters of two books
    public static Book compareChapterNames(Book b1, Book b2) {
        if (b1.chapterNames.length > b2.chapterNames.length) {
            return b1;
        } else {
            return b2;
        }
    }
}

// Runner class
public class Main1 {
    public static void main(String[] args) {
        // Book 1: no-argument constructor + setters
        Book book1 = new Book();
        book1.setAuthor("J.K. Rowling");
        book1.setChapterNames(new String[]{"The Boy Who Lived", "The Vanishing Glass", "The Letters"});

        // Book 2: argument constructor
        String[] chapters2 = {"A Shadow", "The Journey", "The Battle", "The Aftermath"};
        Book book2 = new Book("J.K. Rowling", chapters2);

        // Compare authors
        boolean sameAuthor = Book.compareBooks(book1, book2);
        System.out.println("Do both books have the same author? " + sameAuthor);

        // Compare chapters
        Book largerBook = Book.compareChapterNames(book1, book2);
        System.out.println("Book with more chapters is by: " + largerBook.getAuthor());
    }
}
