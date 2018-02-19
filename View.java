import java.util.Scanner;

public class View{
    Scanner scanner = new Scanner(System.in);

    public void enterISBN(){
        System.out.println("\nEnter a ISBN: ");
    }

    public void enterAuthor(){
        System.out.println("\nEnter a author: ");
    }

    public void enterTitle(){
        System.out.println("\nEnter a title: ");
    }

    public void enterPublisher(){
        System.out.println("\nEnter a publisher: ");
    }

    public void enterPublicationYear(){
        System.out.println("\nEnter a publication year: ");
    }

    public void enterPrice(){
        System.out.println("\nEnter a price: ");
    }

    public void enterType(){
        System.out.println("\nEnter a type: ");
    }

    public void enterTitleOfBookToEdit(){
        System.out.println("\nEnter a title of book you want to edit: ");
    }

    public void enterTitleOfBookToDelete(){
        System.out.println("\nEnter a title of book you want to delete: ");
    }

    public void enterAuthorOfBooks(){
        System.out.println("\n Enter author which books you want: ");
    }

    public void enterBookParameter(){
        System.out.println("\n Enter searching book parameter: ");
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void showMainMenu(){
        System.out.println(
                    "1. Add book\n" +
                    "2. Edit book\n" +
                    "3. Delete book\n" +
                    "4. Books of given author\n" +
                    "5. Books search\n" + 
                    "6. Books sorted by title\n" +
                    "0. Exit the program\n");

    }
}