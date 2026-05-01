import opp.aggregation.Book;
import opp.aggregation.Library;

public class Aggregation {
    // Aggregation = Represents a "has-a" relationship between objects.
    //               One object contains another object as part of its structure,
    //               but the contained object/s can exist independently.

    static void demo(){
        Book book1 = new Book("The fellow of the Ring", 423);
        Book book2 = new Book("The two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("CTG Public Library", 1897, books);

        library.displayInfo();

    }
}
