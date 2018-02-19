import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;

class BookDAO{
    
    public static void addBook(Statement stmt, String ISBN, String author, String title, String publisher, String publicationYear, String price, String type){
        try {
            String query =("insert into Books values(ISBN, author, title, publisher, publicationYear, price, type");
            stmt.executeUpdate(query);
        } catch ( Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void editBook(Statement stmt, String givenTitle){
        try{
            ResultSet rs = stmt.executeQuery("SELECT * FROM Books Where title like '%" + givenTitle + "%'");
            while ( rs.next() ) {
                String ISBN = rs.getString("ISBN");
                String author = rs.getString("author");
                String title  = rs.getString("title");
                String publisher = rs.getString("publisher");
                String publicationYear = rs.getString("publication_year");
                String price = rs.getString("price");
                String type = rs.getString("type");
                
                System.out.println( "ISBN = " + ISBN );
                System.out.println( "author = " + author );
                System.out.println( "title = " + title );
                System.out.println( "publisher = " + publisher );
                System.out.println( "publicationYear = " + publicationYear );
                System.out.println( "price = " + price );
                System.out.println( "type = " + type );
                System.out.println();
             }
        }catch ( Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void deleteBook(Statement stmt, String givenTitle){
        try{
            String query = ("DELETE from Books where title like '%" + givenTitle + "%'");
            stmt.executeUpdate(query);
            
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Books;" );
            
            while ( rs.next() ) {
                String ISBN = rs.getString("ISBN");
                String author = rs.getString("author");
                String title  = rs.getString("title");
                String publisher = rs.getString("publisher");
                String publicationYear = rs.getString("publication_year");
                String price = rs.getString("price");
                String type = rs.getString("type");
                
                System.out.println( "ISBN = " + ISBN );
                System.out.println( "author = " + author );
                System.out.println( "title = " + title );
                System.out.println( "publisher = " + publisher );
                System.out.println( "publicationYear = " + publicationYear );
                System.out.println( "price = " + price );
                System.out.println( "type = " + type );
                System.out.println();
             }
        }catch( Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void booksByAuthor(Statement stmt, String givenAuthor){
        try{
            ResultSet rs = stmt.executeQuery("SELECT * FROM Books Where author like '%" + givenAuthor + "%'");
            while ( rs.next() ) {
                String ISBN = rs.getString("ISBN");
                String author = rs.getString("author");
                String title  = rs.getString("title");
                String publisher = rs.getString("publisher");
                String publicationYear = rs.getString("publication_year");
                String price = rs.getString("price");
                String type = rs.getString("type");
                
                System.out.println( "ISBN = " + ISBN );
                System.out.println( "author = " + author );
                System.out.println( "title = " + title );
                System.out.println( "publisher = " + publisher );
                System.out.println( "publicationYear = " + publicationYear );
                System.out.println( "price = " + price );
                System.out.println( "type = " + type );
                System.out.println();
             }
        }catch ( Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void searchBooks(Statement stmt, String searchPhrase){
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Books where (ISBN || author || title || publisher || publication_year || price || type) like '%" + searchPhrase + "%'");
            while(rs.next()){
                    
                String ISBN = rs.getString("ISBN");
                String author = rs.getString("author");
                String title  = rs.getString("title");
                String publisher = rs.getString("publisher");
                String publicationYear = rs.getString("publication_year");
                String price = rs.getString("price");
                String type = rs.getString("type");
                
                System.out.println( "ISBN = " + ISBN );
                System.out.println( "author = " + author );
                System.out.println( "title = " + title );
                System.out.println( "publisher = " + publisher );
                System.out.println( "publicationYear = " + publicationYear );
                System.out.println( "price = " + price );
                System.out.println( "type = " + type );
                System.out.println();
                }
        } catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void sortedBooks(Statement stmt){
        try{
            ResultSet rs = stmt.executeQuery("SELECT * FROM Books ORDER BY title ASC");
            while(rs.next()){
                    
                String ISBN = rs.getString("ISBN");
                String author = rs.getString("author");
                String title  = rs.getString("title");
                String publisher = rs.getString("publisher");
                String publicationYear = rs.getString("publication_year");
                String price = rs.getString("price");
                String type = rs.getString("type");
                
                System.out.println( "ISBN = " + ISBN );
                System.out.println( "author = " + author );
                System.out.println( "title = " + title );
                System.out.println( "publisher = " + publisher );
                System.out.println( "publicationYear = " + publicationYear );
                System.out.println( "price = " + price );
                System.out.println( "type = " + type );
                System.out.println();
            }
        } catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
}