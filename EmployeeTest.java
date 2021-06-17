import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    @DisplayName("เมืื่อทำการสร้าง employee ด้วย default constructor " + "จะต้องได้ fullname = ':'")
    public void case01() {
        String expectedResult = " : ";
        Employee demo = new Employee();
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("เมืื่อทำการสร้าง employee ด้วย fname+lname " + "จะต้องได้ fullname = 'fname : lname'")
    public void case02() {
        String expectedResult = "mookki : kiki";
        Employee demo = new Employee("mookki", "kiki");
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult, actualResult);
    }

}//