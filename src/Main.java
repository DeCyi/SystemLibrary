import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        LibrarySystem library = new LibrarySystem();
        LibrarySystem.Library myLibrary = library.new Library();
        LibrarySystem.UserInfo myUser = library.new UserInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book details or 'quit' to exit.");
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            LibrarySystem.Book book = library.new Book(title, author, year);
            myLibrary.addBook(book);
        }

        System.out.println("Enter your information");
        while (true) {
            System.out.println("First name: ");
            String first_name = scanner.nextLine();
            if(first_name.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Last name: ");
            String last_name = scanner.nextLine();
            System.out.println("Address: ");
            String Address = scanner.nextLine();
            System.out.println("Age: ");
            int age = scanner.nextInt();

            LibrarySystem.User user = library.new User(first_name, last_name, Address, age);
            myUser.addUser(user);

        }

        System.out.print("Enter a title to search: ");
        String searchTitle = scanner.nextLine();
        ArrayList<LibrarySystem.Book> searchResult = database.searchByTitle(searchTitle);

        if (searchResult.isEmpty()) {
            System.out.println("No book found with title: " + searchTitle);
        } else {
            System.out.println("Search results for title: " + searchTitle);
            for (LibrarySystem.Book book : searchResult) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " Year: " + book.getPublicationDate());
            }
        }

    }
}