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
    @Test
    public void testResturnsXL(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XL", romanNumerals.numerals(40));
    }

    @Test
    public void testReturnsL(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("L", romanNumerals.numerals(50));
    }
    @Test
    public void testReturnsLXIII(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("LXIII", romanNumerals.numerals(63));
    }

    @Test
    public void testReturnsXCIV(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XCIV", romanNumerals.numerals(94));
    }
    @Test
    public void testReturnsCDLXIII(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("CDLXIII", romanNumerals.numerals(463));
    }
    @Test
    public void testReturnsMM() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MM", romanNumerals.numerals(2000));
    }

    @Test
    public void testReturnsMMMCMXCIX(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCMXCIX", romanNumerals.numerals(3999));
    }
}
