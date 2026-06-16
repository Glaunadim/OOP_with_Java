class LibraryBook {
    private String title;
    private String author;
    private String bookID;

    public LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + this.bookID);
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The 4 Hour Work Week", "Tim Ferris", "IIUCM-8842");
        LibraryBook book2 = new LibraryBook("Choose Yourself", "James Altucher", "IIUCM-3915");

        System.out.println("- Library Book Records -");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}