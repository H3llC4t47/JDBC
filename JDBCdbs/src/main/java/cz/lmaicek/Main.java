package cz.lmaicek;

import java.sql.*;

public class Main {
    public static void main(String args[]) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Knihy");

        while(resultSet.next()) {
            System.out.println(resultSet.getString("Nazev"));
            System.out.println(resultSet.getString("Obsah"));
            System.out.println("-----");
        }
        connection.close();
    }
}
