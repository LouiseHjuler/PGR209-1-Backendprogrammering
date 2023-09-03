import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @Test
    public void testOneReturnsI(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.numerals(1));
    }
    @Test
    public void testTwoReturnsII(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II", romanNumerals.numerals(2));
    }
    @Test
    public void testTwoReturnsII(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II", romanNumerals.numerals(2));
    }
    @Test
    public void test20ReturnsXX(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XX", romanNumerals.numerals(20));
    }
}
