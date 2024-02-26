package lesson8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class connection {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");

            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "123");
            stmt = c.createStatement();
            String sql = "SELECT * FROM cars;";
            ResultSet rs = stmt.executeQuery(sql);
            while ( rs.next() ) {
                String  brand = rs.getString("brand");
                String  model = rs.getString("model");
                int year = rs.getInt("year");
                System.out.println( "Brand = " + brand );
                System.out.println( "Model = " + model );
                System.out.println( "Year = " + year );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

    }
}