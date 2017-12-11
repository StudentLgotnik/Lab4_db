import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CountriesTests {
    @BeforeAll
    static void befote() throws ClassNotFoundException {
        Countries.getCountriesData();
    }
    @Test
    void Test1() throws ClassNotFoundException, SQLException {
        Countries countries = Countries.Countries.get(0);
        assertNotNull(countries.getId());
        System.out.println("First");
    }
    @Test
    void Test2() throws ClassNotFoundException {
        Countries countries = Countries.Countries.get(1);
        assertNotNull(countries.getId());
        System.out.println("Second");
    }
    @Test
    void Test3() throws ClassNotFoundException {
        Countries countries = Countries.Countries.get(2);
        assertNotNull(countries.getId());
        System.out.println("Third");
    }
    @Test
    void Test4() throws ClassNotFoundException {
        Countries countries = Countries.Countries.get(3);
        assertNotNull(countries.getId());
        System.out.println("Fourth");
    }
    @Test
    void Test5() throws ClassNotFoundException {
        Countries countries = Countries.Countries.get(4);
        assertNotNull(countries.getId());
        System.out.println("Fifth");
    }
    @Test
    void Test6() throws ClassNotFoundException {
        Countries countries = Countries.Countries.get(5);
        assertNotNull(countries.getId());
        System.out.println("Sixth");
    }
}
