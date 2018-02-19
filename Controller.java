import java.sql.Statement;
import java.util.Scanner;

class Controller{
    
    private View view = new View();
    private static final String ADD_BOOK = "1";
    private static final String EDIT_BOOK = "2";
    private static final String DELETE_BOOK = "3";
    private static final String BOOKS_OF_GIVEN_AUTHOR = "4";
    private static final String BOOKS_SEARCH = "5";
    private static final String SORTED_BOOKS = "6";
    private static final String EXIT = "0";

    void Start(){
        boolean runProgram = true;
        Statement stmt = DatabaseDAO.connection();
        
        while (runProgram) {
            view.showMainMenu();
            String userInput = view.getUserInput();
            switch(userInput){
                case ADD_BOOK:
                    addNewBook(stmt);
                    break;
                case EDIT_BOOK:
                    editBook(stmt);
                    break;
                case DELETE_BOOK:
                    deleteBook(stmt);
                    break;
                case BOOKS_OF_GIVEN_AUTHOR:
                    booksByAuthor(stmt);
                    break;
                case BOOKS_SEARCH:
                    booksByOneParameter(stmt);
                    break;
                case SORTED_BOOKS:
                    sortedBooks(stmt);
                    break;
                case EXIT:
                    runProgram = false;
                    break;
            }
        }
        DatabaseDAO.closeConnection(rs, stmt);
    }

    void addNewBook(Statement stmt){
        view.enterISBN();
        String ISBN = view.getUserInput();
        view.enterAuthor();
        String author = view.getUserInput();
        view.enterTitle();
        String title = view.getUserInput();
        view.enterPublisher();
        String publisher = view.getUserInput();
        view.enterPublicationYear();
        String publicationYear = view.getUserInput();
        view.enterPrice();
        String price = view.getUserInput();
        view.enterType();
        String type = view.getUserInput();
        BookDAO.addBook(stmt, ISBN, author, title, publisher, publicationYear, price, type);
    }

    void editBook(Statement stmt){
        view.enterTitleOfBookToEdit();
        String title = view.getUserInput();
        BookDAO.editBook(stmt, title);
    }

    void deleteBook(Statement stmt){
        view.enterTitleOfBookToDelete();
        String title = view.getUserInput();
        BookDAO.deleteBook(stmt, title);
    }

    void booksByAuthor(Statement stmt){
        view.enterAuthorOfBooks();
        String author = view.getUserInput();
        BookDAO.booksByAuthor(stmt, author);
    }

    void booksByOneParameter(Statement stmt){
        view.enterBookParameter();
        String searchPhrase = view.getUserInput();
        BookDAO.searchBooks(stmt, searchPhrase);
    }

    void sortedBooks(Statement stmt){
        BookDAO.sortedBooks(stmt);
    }
}