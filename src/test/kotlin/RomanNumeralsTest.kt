import org.example.RomanNumberConverter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource

class RomaNumeralsTest {

    @ParameterizedTest
    @CsvFileSource(resources = ["/data.csv"], numLinesToSkip = 1)
    fun `should match`(arabic: Int, roman: String) {
        assertEquals(roman, RomanNumberConverter.convert(arabic))
    }
}