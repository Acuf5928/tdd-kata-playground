import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertThrows
import java.lang.IllegalArgumentException

class StringCalculatorTest {
    @Test
    fun uno() {
        val toTest = stringCalculator("")
        val aspected = 0

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun due() {
        val toTest = stringCalculator("  ")
        val aspected = 0

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun tre() {
        val toTest = stringCalculator("52")
        val aspected = 52

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun quattro() {
        val toTest = stringCalculator("50, 10")
        val aspected = 60

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun cinque() {
        assertThrows(IllegalArgumentException::class.java) {
            stringCalculator("50\n, 10")
        }
    }

    @Test
    fun sei() {
        assertThrows(IllegalArgumentException::class.java) {
            stringCalculator("50, \n")
        }
    }

    @Test
    fun sette() {
        val toTest = stringCalculator("5\n1, 4")
        val aspected = 10

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun otto() {
        assertThrows(IllegalArgumentException::class.java) {
            stringCalculator("50, ")
        }
    }

    @Test
    fun nove() {
        assertThrows(IllegalArgumentException::class.java) {
            stringCalculator("bistecca ai ferri 😍❤")
        }
    }
}
