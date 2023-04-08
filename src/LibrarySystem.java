import java.util.ArrayList; // Import the ArrayList class from the java.util package.

public class LibrarySystem { // Declare a public class named LibrarySystem.

    class Book { // Declare a nested class named Book.
        private String title, author; // Declare two private instance variables: title and author, both of type String.
        private int publicationDate; // Declare a private instance variable: publicationDate, of type int.

        public Book(String title, String author, int publication_year) { // Define a constructor for the Book class that takes three parameters: title, author, and publication_year.
            this.title = title; // Initialize the title instance variable with the value passed as the title parameter.
            this.author = author; // Initialize the author instance variable with the value passed as the author parameter.
            this.publicationDate = publication_year; // Initialize the publicationDate instance variable with the value passed as the publication_year parameter.
        }

        public String getTitle() { // Declare a public method named getTitle that returns a String.
            return title; // Return the value of the title instance variable.
        }

        public String getAuthor() { // Declare a public method named getAuthor that returns a String.
            return author; // Return the value of the author instance variable.
        }

        public int getPublicationDate() { // Declare a public method named getPublicationDate that returns an int.
            return publicationDate; // Return the value of the publicationDate instance variable.
        }

        public void setTitle(String Title) { // Declare a public method named setTitle that takes a String parameter named Title and returns nothing.
            this.title = Title; // Set the title instance variable to the value passed as the Title parameter.
        }

        public void setAuthor(String Author) { // Declare a public method named setAuthor that takes a String parameter named Author and returns nothing.
            this.author = Author; // Set the author instance variable to the value passed as the Author parameter.
        }

        public void setPublication_year(int publicationYear) { // Declare a public method named setPublication_year that takes an int parameter named publicationYear and returns nothing.
            this.publicationDate = publicationYear; // Set the publicationDate instance variable to the value passed as the publicationYear parameter.
        }
    }

    class Library { // Declare a nested class named Library.
        private ArrayList<Book> books; // Declare a private instance variable: books, which is an ArrayList of Book objects.



        public Library() { // Define a constructor for the Library class.
            this.books = new ArrayList<Book>(); // Initialize the books instance variable to a new ArrayList of Book objects.
        }

        public void addBook(Book book) { // Declare a public method named addBook that takes a Book parameter named book and returns nothing.
            this.books.add(book); // Add the Book object passed as the book parameter to the books ArrayList.
        }

        public void removeBook(Book book) { // Declare a public method named removeBook that takes a Book parameter named book and returns nothing.
            this.books.remove(book); // Remove the Book object passed as the book parameter from the books ArrayList.
        }

        public ArrayList<Book> searchByTitle(String title) { // Declare a public method named searchByTitle that takes a String parameter named title and returns an ArrayList of Book objects.
            ArrayList<Book> result = new ArrayList<Book>(); // Declare and initialize a new ArrayList of Book objects named result.
            for (Book book : this.books) { // Iterate over each Book object in the books ArrayList.
                if (book.getTitle().equals(title)) { // If the title of the current Book object matches the title parameter passed to the searchByTitle method...
                    result.add(book); // ...add the current Book object to the result ArrayList.
                }
            }
            return result; // Return the result ArrayList.
        }

        public ArrayList<Book> searchByAuthor(String author) { // Declare a public method named searchByAuthor that takes a String parameter named author and returns an ArrayList of Book objects.
            ArrayList<Book> result = new ArrayList<Book>(); // Declare and initialize a new ArrayList of Book objects named result.
            for (Book book : this.books) { // Iterate over each Book object in the books ArrayList.
                if (book.getAuthor().equals(author)) { // If the author of the current Book object matches the author parameter passed to the searchByAuthor method...
                    result.add(book); // ...add the current Book object to the result ArrayList.
                }
            }
            return result; // Return the result ArrayList.
        }
    }

    class User {


        private String first_name, last_name;
        private String Address;
        private int age;

        public User(String first_name, String last_name, String Address, int age) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.Address = Address;
            this.age = age;
        }

        public String getFirst_name() {
            return first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public String getAddress() {
            return Address;
        }

        public int getAge() {
            return age;
        }

       public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public void setAge(int age) {
            this.age = age;
        }


    }

    class UserInfo {
        private ArrayList<User> user; // Declare a private instance variable: books, which is an ArrayList of Book objects.



        public UserInfo() { // Define a constructor for the Library class.
            this.user = new ArrayList<>(); // Initialize the books instance variable to a new ArrayList of Book objects.
        }

        public void addUser(User user) { // Declare a public method named addBook that takes a Book parameter named book and returns nothing.
            this.user.add(user); // Add the Book object passed as the book parameter to the books ArrayList.
        }

        public void removeUser(User user) { // Declare a public method named removeBook that takes a Book parameter named book and returns nothing.
            this.user.remove(user); // Remove the Book object passed as the book parameter from the books ArrayList.
        }

    }
}