package MVCPattern.LibrarySystem;

class LibraryController {
  private Book model;
  private LibraryView view;
  
  public LibraryController(Book model, LibraryView view){
    this.model = model;
    this.view = view;
  }

  //Update view
  public void updateView(){
    view.displayBookDetails(
        model.getTitle(),
        model.getAuthor(),
        model.getBookId());
  }

  //Update Model Data
  public void setBookTitle(String title){
    model.setTitle(title);
  }

  public void setBookAuthor(String author){
    model.setAuthor(author);
  }
}
