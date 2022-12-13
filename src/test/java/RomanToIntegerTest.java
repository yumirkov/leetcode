import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger solution = new RomanToInteger();

    @Test
    void example1() {
        // given
        var input = "MCMXCIV";
        var expected = 1994;
        // when
        var actual = solution.romanToInt(input);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        // given
        var input = "LVIII";
        var expected = 58;
        // when
        var actual = solution.romanToInt(input);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void example3() {
        // given
        var input = "III";
        var expected = 3;
        // when
        var actual = solution.romanToInt(input);
        // then
        assertEquals(expected, actual);
    }
}