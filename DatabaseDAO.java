import java.sql.*;

class DatabaseDAO{
    
    private static Statement stmt = null;

    public static Statement connection() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:db.sql");
            stmt = c.createStatement();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


        System.out.println("Opened database successfully");
        return stmt;
    }

    public static void closeConnection(ResultSet rs, Statement stmt){
        try {
            if(rs!=null) {
                rs.close();
                stmt.close();
            }else {
                stmt.close();
            }
        }
        catch (Exception e){
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
    }

}