package MVCPattern.LibrarySystem;

class LibraryView {
    public void displayBookDetails(
        String title,
        String author,
        int bookId
    ){
         System.out.println("Book Id: " +bookId);
        System.out.println("Book Title: " +title);
        System.out.println("Book Author: " +author);
    }
}
