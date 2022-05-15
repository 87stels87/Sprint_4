import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    @DisplayName("Проверка логики работы метода checkNameToEmboss() (Позитивная проверка)")
    @Description("Проверка логики работы метода checkNameToEmboss() (Позитивная проверка)")
    public void testGetName() {
        Account account = new Account("Фамилия Имя");
        boolean actual = account.checkNameToEmboss();
        assertTrue("Позитивная проверка метода checkNameToEmboss()", actual);
    }

    @Test
    @DisplayName("Проверка логики работы метода getName() (Позитивная проверка)")
    @Description("Проверка логики работы метода getName() (Позитивная проверка)")
    public void testReturnGetName() {
        Account account = new Account("Фамилия Имя");
        String actual = account.getName();
        String expected = "Фамилия Имя";
        assertEquals("Позитивная проверка метода getName()", expected, actual);
    }
    @DisplayName("Проверка исключения NullPointerException")
    @Description("Проверка исключения NullPointerException")
    @Test (expected = NullPointerException.class)
    public void testNullPointerException() throws NullPointerException {
        Account account = new Account();
        boolean actual = account.checkNameToEmboss();
    }
}
