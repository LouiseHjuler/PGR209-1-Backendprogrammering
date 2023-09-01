import org.example.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCoolTest {


    @Test
    void isLeapYear(){
        LeapYear leapYear = new LeapYear();
        assertEquals(leapYear.isLeapYear(2023),true);
        assertEquals(leapYear.isLeapYear(2020),true);
    }
}
