public class Main
{
    public static void main(String[] args)
    {

        Library Library1 = new Library("10 Main St.");
        Library Library2 = new Library("228 Liberty St.");



        Library1.addBook(new Book("The Da Vinci Code"));
        Library1.addBook(new Book("Le Petit Prince"));
        Library1.addBook(new Book("A Tale of Two Cities"));


        System.out.println("Library hours.");
        Library.printWorkingHours();
        System.out.println();

        System.out.println("Library addresses:");
        Library1.printAddress();
        Library2.printAddress();
        System.out.println();

        System.out.println("Borrowing The Lord of the Rings:");
        Library1.borrowBook("The Lord of the Rings:");
        Library1.borrowBook("The Lord of the Rings:");
        Library2.borrowBook("The Lord of the Rings:");
        System.out.println();

        System.out.println("Books available in the first library:");

        Library1.availableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        Library2.availableBooks();
        System.out.println();

        System.out.println("Returning The Lord of the Rings:");
        Library1.borrowBook("The Lord of the Rings");
        System.out.println();
        System.out.println("Books available in the first library:");
        Library1.addBook(new Book("The Lords of the Rings"));
        Library1.availableBooks();

    }
}
