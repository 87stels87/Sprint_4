import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountParemetrizedNegativeTest {
    private final String name;
    private final boolean expected;

    public AccountParemetrizedNegativeTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }
    @Parameterized.Parameters(name = "Написание фамилии и имени и корректность заданным условиям:{0} {1}")
    public static Object[] checkedString() {
        return new Object[][]{
                {"", false},
                {" Фамилия Имя ", false},
                {" Фамилия Имя", false},
                {"Фамилия Имя ", false},
                {" ", false},
                {"Фа", false},
                {"&@$%&**(__ ", false},
                {"ФамилияИмяФамилияИмя", false},
                {"ФамилияИмяФамилияИм", false},
                {"Фам илия Имя Ф", false},
                {" ФАМИЛИЯ ИМЯ", false},
                {"фио", false},
        };
    }
    @Test
    @DisplayName("Проверка логики работы метода checkNameToEmboss() (Серия негативных проверок)")
    @Description("Проверка логики работы метода checkNameToEmboss() (Серия негативных проверок)")
    public void testCheckNameToEmboss() {
        Account account = new Account(name);
        Boolean actual = account.checkNameToEmboss();
        assertEquals("Параметризованный негативный тест метода checkNameToEmboss()", expected, actual);

    }


}
