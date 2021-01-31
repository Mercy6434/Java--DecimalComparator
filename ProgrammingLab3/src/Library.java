import java.util.ArrayList;

public class Library
{
   private String address;
   ArrayList<Book> books = new ArrayList<Book>();


   public Library(String address)
   {
       this.address = address;
   }



   public void addBook(Book book)
   {
       books. add(book);
   }


   public static void printWorkingHours()
   {
       System.out.println("Libraries are open daily from 9am to 5pm.");
   }



   public void printAddress()
   {
       System.out.println(address);
   }



   public void borrowBook(String bookTitle)
   {
       boolean bookPresent = false;
       for (Book book : books)
       {
           if(book.getTitle().equals(bookTitle))
           {
               bookPresent = true;
               if (book.isBorrowed())
               {
                   System.out.println("Sorry this book is already borrowed");
               }else
                   {
                       book.rented();
                       System.out.println("You successfully borrowed " + bookTitle);
                   }
           }
       }
       if(!bookPresent)
       {
           System.out.println("Sorry, this book is not in our catalog");
       }
   }




   private void returnBook(String bookTitle)
   {
       for (Book book : books)
       {
           if (book.getTitle().equals(bookTitle))
           {
               book.returned();
           }
       }
   }


    //printAvailableBooks

   public void availableBooks()
   {
       for(Book book : books)
       {
           if (!book.isBorrowed())
           {
               System.out.println(book.getTitle());
           }
       }
   }

}
