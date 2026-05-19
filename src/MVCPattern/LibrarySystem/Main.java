package MVCPattern.LibrarySystem;

public class Main {
    public static void main(String[] args) {
        //Create model
        Book model = new Book(
            "Harry Potter", "J.K. Rowling", 1001
        );

        //Create View
        LibraryView view = new LibraryView();

        //Create Controller
        LibraryController controller = new LibraryController(model, view); 

        //Display original details
        System.out.println("Original Book Details");
        System.out.println("-----------------------------");

        controller.updateView();

        //Update Book Details
        controller.setBookTitle("The Hobbit");
        controller.setBookAuthor("J.R.R. Tolkein");

        //Display Updated Details
        System.out.println("\nUpdated Book Details");
        System.out.println("----------------------------");

        controller.updateView();
    }
    
}
