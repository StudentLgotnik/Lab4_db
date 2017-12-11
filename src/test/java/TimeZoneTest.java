import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeZoneTest {
    @BeforeAll
    public void befote() throws ClassNotFoundException {
        TimeZone.getTimeZoneData();
    }
    @Test
    void Test1() throws ClassNotFoundException, SQLException {
        TimeZone timeZone = TimeZone.TimeZones.get(0);
        assertNotNull(timeZone.getId());
        System.out.println("First");
    }
    @Test
    void Test2() throws ClassNotFoundException {
        TimeZone timeZone = TimeZone.TimeZones.get(1);
        assertNotNull(timeZone.getId());
        System.out.println("Second");
    }
    @Test
    void Test3() throws ClassNotFoundException {
        TimeZone timeZone = TimeZone.TimeZones.get(2);
        assertNotNull(timeZone.getId());
        System.out.println("Third");
    }

}
