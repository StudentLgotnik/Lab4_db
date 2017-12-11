
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CapitalTests {
    @BeforeAll
    static void befote(){
        Capital.getCapitalData();
    }
    @Test
    void Test1() throws ClassNotFoundException, SQLException {
        //Capital capital = Capital.Capitals.get(0);
        Capital capital = new Capital("1", "Ukraine", "Khlichko", 300000);
        assertNotNull(capital.getId());
        System.out.println("First");
    }
    @Test
    void Test2(){
        Capital capital = Capital.Capitals.get(1);
        assertNotNull(capital.getId());
        System.out.println("Second");
    }
    @Test
    void Test3(){
        Capital capital = Capital.Capitals.get(2);
        assertNotNull(capital.getId());
        System.out.println("Third");
    }
    @Test
    void Test4(){
        Capital capital = Capital.Capitals.get(3);
        assertNotNull(capital.getId());
        System.out.println("Fourth");
    }
    @Test
    void Test5(){
        Capital capital = Capital.Capitals.get(4);
        assertNotNull(capital.getId());
        System.out.println("Fifth");
    }
    @Test
    void Test6(){
        Capital capital = Capital.Capitals.get(5);
        assertNotNull(capital.getId());
        System.out.println("Sixth");
    }
}
