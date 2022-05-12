import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountParemetrizedTest {
    private final String name;
    private final boolean expected;


    public AccountParemetrizedTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Написание фамилии и имени и корректность заданным условиям:{0} {1}")
    public static Object[] checkedString() {
        return new Object[][]{
                {"Фамилия Имя", true},
                {"", false},
                {" Фамилия Имя ", false},
                {" Фамилия Имя", false},
                {"Фамилия Имя ", false},
                {" ", false},
                {"   ", false},
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
    public void testCheckNameToEmboss() {
        Account account = new Account(name);
        Boolean actual = account.checkNameToEmboss();
        assertEquals("Параметризованный тест на проверку заданным условиям", expected, actual);

    }


}
