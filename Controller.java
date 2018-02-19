import java.sql.Statement;
import java.util.Scanner;

class Controller{
    private View view;

    // Controller(View view){
    //     this.view = view;
    // }

    void Start(){
        Statement stmt = DatabaseDAO.connection();
        System.out.println("aaaaa");

        addNewBook(stmt);
    }

    private void addNewBook(Statement stmt){

        String ISBN = view.getUserInput();
        String author = view.getUserInput();
        String title = view.getUserInput();
        String publisher = view.getUserInput();
        String publicationYear = view.getUserInput();
        String price = view.getUserInput();
        String type = view.getUserInput();
        BookDAO.addBook(stmt, ISBN, author, title, publisher, publicationYear, price, type);

    }

    void setISBN(){
        view.getUserInput();
    }
}