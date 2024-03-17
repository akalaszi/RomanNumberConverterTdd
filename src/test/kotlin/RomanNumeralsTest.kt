import org.example.RomanNumerals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomaNumeralsTest {


    @Test
    fun ` should match`() {
        assertEquals("I", RomanNumerals.convert(1))
        assertEquals("II", RomanNumerals.convert(2))
    }
}