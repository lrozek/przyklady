package pl.lrozek.szkolenia.exception.resources.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithJdbcResourcesHandlingMain {

    public static void main( String[] args ) {

        try (Connection connection = new DummyJdbcConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery( "" )) {
            System.out.println( "extracting data" );
            while ( resultSet.next() ) {
                System.out.println( "extracting data in loop" );
            }
        }
        catch ( SQLException e ) {
            throw new RuntimeException( e );
        }
    }
}
