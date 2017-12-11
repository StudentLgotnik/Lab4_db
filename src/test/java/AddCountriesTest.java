import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddCountriesTest {
    @Test
    void Test1() throws ClassNotFoundException, SQLException {
        Countries countries = new Countries("1", "Poland", "Eurasia", 38483957, "Warsaw", "+2" );
        int expected;
        int real;
        Connection connection = Connections.connect();
        try {
            Statement statement = connection.createStatement();
            ResultSet rset = statement.executeQuery("select * from SYSTEM.CONTINENT");
            rset.next();
            expected = rset.getInt(4);
            rset.close();
            Countries.addCountries(countries);
            ResultSet rset1 = statement.executeQuery("select * from SYSTEM.CONTINENT");
            rset1.next();
            real = rset1.getInt(4);
            rset1.close();
            statement.close();
            assertEquals(expected, real -1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("First");
    }

    @Test
    void Test2() throws ClassNotFoundException, SQLException {
        Countries countries = new Countries("2", "Egypt", "Africa", 97041072, "Cairo", "+3" );
        int expected = 0;
        int real = 0;
        Connection connection = Connections.connect();
        try {
            Statement statement = connection.createStatement();
            ResultSet rset = statement.executeQuery("select * from SYSTEM.CONTINENT");
            while(rset.next()){
                expected++;
            }
            rset.close();
            Countries.addCountries(countries);
            ResultSet rset1 = statement.executeQuery("select * from SYSTEM.CONTINENT");
            while(rset1.next()){
                real++;
            }
            rset1.close();
            statement.close();
            assertEquals(expected, real -1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Second");
    }
}
