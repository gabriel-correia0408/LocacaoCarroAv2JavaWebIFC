

import Database.DbConfig;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DbConfigTest {

    @Test
    public void testConnection() {
        assertNotNull(DbConfig.getSession());
    }
}