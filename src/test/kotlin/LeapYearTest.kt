import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class LeapYearTest {
    @Test
    fun uno() {
        val toTest = leapYear(1991)
        val aspected = false

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun due() {
        val toTest = leapYear(2004)
        val aspected = true

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun tre() {
        val toTest = leapYear(1900)
        val aspected = false

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun quattro() {
        val toTest = leapYear(2000)
        val aspected = true

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun cinque() {
        val toTest = leapYear(2000)
        val aspected = true

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun sei() {
        val toTest = leapYear(1580)
        val aspected = true

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun sette() {
        val toTest = leapYear(0)
        val aspected = false

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun otto() {
        val toTest = leapYear(4)
        val aspected = true

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun nove() {
        val toTest = leapYear(1500)
        val aspected = true

        assertThat(toTest).isEqualTo(aspected)
    }

    @Test
    fun dieci() {
        val toTest = leapYear(1501)
        val aspected = false

        assertThat(toTest).isEqualTo(aspected)
    }
}
