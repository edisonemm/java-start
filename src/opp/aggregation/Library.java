package opp.aggregation;

public class Library {
    private String name;
    private int year;
    private Book[] books;

    public Library(String name, int year, Book[] books) {
        setName(name);
        setYear(year);
        setBooks(books);

    }

    public void displayInfo(){
        IO.println("The " + getYear() + " " + getName());
        IO.println("Books Available: ");
        for (Book book : books){
            IO.println(book.displayInfo());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
