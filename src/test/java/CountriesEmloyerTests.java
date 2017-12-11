import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CountriesEmloyerTests {
    @BeforeAll
    static void befote() throws ClassNotFoundException {
        Countriesemployer.getContriesEmployerData();
    }
    @Test
    void Test1() throws ClassNotFoundException, SQLException {
        Countriesemployer countriesemployer = Countriesemployer.Countriesemployers.get(0);
        assertNotNull(countriesemployer.getId());
        System.out.println("First");
    }
    @Test
    void Test2() throws ClassNotFoundException {
        Countriesemployer countriesemployer = Countriesemployer.Countriesemployers.get(1);
        assertNotNull(countriesemployer.getId());
        System.out.println("Second");
    }
   @Test
    void Test3() throws ClassNotFoundException {
        Countriesemployer countriesemployer = Countriesemployer.Countriesemployers.get(2);
        assertNotNull(countriesemployer.getId());
        System.out.println("Third");
    }
    @Test
    void Test4() throws ClassNotFoundException {
        Countriesemployer countriesemployer = Countriesemployer.Countriesemployers.get(3);
        assertNotNull(countriesemployer.getId());
        System.out.println("Fourth");
    }
    @Test
    void Test5() throws ClassNotFoundException {
        Countriesemployer countriesemployer = Countriesemployer.Countriesemployers.get(4);
        assertNotNull(countriesemployer.getId());
        System.out.println("Fifth");
    }
    @Test
    void Test6() throws ClassNotFoundException {
        Countriesemployer countriesemployer = Countriesemployer.Countriesemployers.get(5);
        assertNotNull(countriesemployer.getId());
        System.out.println("Sixth");
    }
}
