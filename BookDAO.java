import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;

class BookDAO{
    
    public static void addBook(Statement stmt, String ISBN, String author, String title, String publisher, String publicationYear, String price, String type){
        try {
            // Scanner sc = new Scanner(System.in);
            // System.out.print("\nEnter a ISBN: ");
            // int ISBN = sc.nextInt();

            // System.out.print("\nEnter a author: ");
            // String author = sc.nextLine();
    
            // System.out.print("\nEnter a title: ");
            // String title = sc.nextLine();
    
            // System.out.print("\nEnter a publisher: ");
            // String publisher = sc.nextLine();

            // System.out.print("\nEnter a publication year: ");
            // int publicationYear = sc.nextInt();

            // System.out.print("\nEnter a price: ");
            // int price = sc.nextInt();

            // System.out.print("\nEnter a type: ");
            // int type = sc.nextInt();

            String query =("insert into Books values(ISBN, author, title, publisher, publicationYear, price, type");
            stmt.executeUpdate(query);
            System.out.println("aaaa");
            // ResultSet rs = stmt.executeQuery("SELECT * FROM Books");
            // System.out.println("bbbb");
            // while(rs.next()){
            //     int ISBN  = rs.getInt("ISBN");
            //     String author = rs.getString("author");
            //     String title = rs.getString("title");
            //     String publisher = rs.getString("publisher");
            //     int publicationYear = rs.getString("publication_year");
            //     int price = rs.getInt("price");
            //     int type = rs.getInt("type");

            //     //Display values
            //     System.out.println("ID: " + id + '\n');
            //     System.out.println("first_name: " + firstName + '\n');
            //     System.out.println("last_name: " + lastName+ '\n');
            //     System.out.println("phone_number: " + phoneNumber+ '\n');
            //     System.out.println("email: " + email+ '\n');
            //     System.out.println("application_code: " + applcationCode+ '\n');
            // }
        //SQLiteJDBC.closeConnection(rs, stmt);
        } catch ( Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
}