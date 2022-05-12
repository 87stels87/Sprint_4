import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    @Test
    public void testGetName() {
        Account account = new Account("Фамилия Имя");
        boolean actual = account.checkNameToEmboss();
        assertTrue("Позитивная проверка метода checkNameToEmboss()", actual);
    }

    @Test
    public void testReturnGetName() {
        Account account = new Account("Фамилия Имя");
        String actual = account.getName();
        String expected = "Фамилия Имя";
        assertEquals("Позитивная проверка метода getName()", expected, actual);
    }

}
