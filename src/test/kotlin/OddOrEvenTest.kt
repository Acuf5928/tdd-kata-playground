import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testNullList() {
        assertThat(oddOrEven(null)).isEqualTo(PARI)
    }

    @Test
    fun testEmpyList() {
        val listOne = listOf<Int>()
        assertThat(oddOrEven(listOne)).isEqualTo(PARI)
    }

    @Test
    fun testListWith0() {
        val listTwo = listOf(0)
        assertThat(oddOrEven(listTwo)).isEqualTo(PARI)
    }

    @Test
    fun testListOdd() {
        val listThree = listOf(2, 5, 34, 6)
        assertThat(oddOrEven(listThree)).isEqualTo(DISPARI)
    }

    @Test
    fun testListEven() {
        val listFour = listOf(0, -1, -5)
        assertThat(oddOrEven(listFour)).isEqualTo(PARI)
    }
}
