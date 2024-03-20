import org.example.RomanNumberConverter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource

class RomanNumberConverterTest {

    @ParameterizedTest
    @CsvFileSource(resources = ["/data.csv"], numLinesToSkip = 1)
    fun `should match`(arabic: Int, roman: String) {
        assertEquals(roman, RomanNumberConverter.convert(arabic))
    }

    @Test
    fun `should split to digits`() {
        assertEquals(listOf(3, 2, 1), RomanNumberConverter.splitToDigits(123))
    }
}