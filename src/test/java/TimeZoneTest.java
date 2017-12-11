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
    static void befote() {
        TimeZone.getTimeZoneData();
    }
    @Test
    void Test1() {
        TimeZone timeZone = TimeZone.TimeZones.get(0);
        assertNotNull(timeZone.getId());
        System.out.println("First");
    }
    @Test
    void Test2() {
        TimeZone timeZone = TimeZone.TimeZones.get(1);
        assertNotNull(timeZone.getId());
        System.out.println("Second");
    }
    @Test
    void Test3() {
        TimeZone timeZone = TimeZone.TimeZones.get(2);
        assertNotNull(timeZone.getId());
        System.out.println("Third");
    }

}
