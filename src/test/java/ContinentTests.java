import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContinentTests {
    @BeforeAll
    static void befote() throws ClassNotFoundException {
        Continent.getContinentData();
    }
    @Test
    void Test1() throws ClassNotFoundException, SQLException {
        Continent continent = Continent.Continents.get(0);
        assertNotNull(continent.getId());
        System.out.println("First");
    }
    @Test
    void Test2() throws ClassNotFoundException {
        Continent continent = Continent.Continents.get(1);
        assertNotNull(continent.getId());
        System.out.println("Second");
    }

}
