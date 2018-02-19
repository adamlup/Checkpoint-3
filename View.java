import java.util.Scanner;

public class View{
    Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        return scanner.nextLine();
    }
}