import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @Test
    public void testReturnsI(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.numerals(1));
    }
    @Test
    public void testReturnsII(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II", romanNumerals.numerals(2));
    }
    @Test
    public void testReturnsIV(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IV", romanNumerals.numerals(4));
    }

    @Test
    public void testReturnsVII(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VII", romanNumerals.numerals(7));
    }

    @Test
    public void testReturnsXX(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XX", romanNumerals.numerals(20));
    }
}
