import java.util.ArrayList;

public class Database {
    private LibrarySystem.Library myLibrary;
    private LibrarySystem.User myUser;

    public Database() {
        LibrarySystem library = new LibrarySystem();
        myLibrary = library.new Library();



        // Books Library //
        myLibrary.addBook(library.new Book("Jojo Bizzare's Adventure", "Araki", 1987));
        myLibrary.addBook(library.new Book("My Hero Academia", "Joe Biden", 1932));
        myLibrary.addBook(library.new Book("GATE", "Takumi Yanai", 2006));
        myLibrary.addBook(library.new Book("Oregairu", "Yakashi", 2008));
    }
    public ArrayList<LibrarySystem.Book> searchByTitle(String title) {
        return myLibrary.searchByTitle(title);
    }
}

