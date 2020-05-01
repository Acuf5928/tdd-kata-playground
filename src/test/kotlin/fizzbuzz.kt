import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class FizzTest {
    @Test
    fun pippo() {
        val actual = fizzBuzz(3)
        val expected = "fizz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo2() {
        val actual = fizzBuzz(1)
        val expected = "1"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo3() {
        val actual = fizzBuzz(0)
        val expected = ""
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo4() {
        val actual = fizzBuzz(5)
        val expected = "buzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo5() {
        val actual = fizzBuzz(15)
        val expected = "fizzbuzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo6() {
        val actual = fizzBuzz(20)
        val expected = "buzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo7() {
        val actual = fizzBuzz(21)
        val expected = "fizz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo8() {
        val actual = fizzBuzz(30)
        val expected = "fizzbuzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo9() {
        val actual = fizzBuzz(105)
        val expected = ""
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo10() {
        val actual = fizzBuzz(35)
        val expected = "buzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo11() {
        val actual = fizzBuzzList(100).joinToString()
        val expected = "1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz, 16, 17, fizz, 19, buzz, fizz, 22, 23, fizz, buzz, 26, fizz, 28, 29, fizzbuzz, 31, 32, fizz, 34, buzz, fizz, 37, 38, fizz, buzz, 41, fizz, 43, 44, fizzbuzz, 46, 47, fizz, 49, buzz, fizz, 52, 53, fizz, buzz, 56, fizz, 58, 59, fizzbuzz, 61, 62, fizz, 64, buzz, fizz, 67, 68, fizz, buzz, 71, fizz, 73, 74, fizzbuzz, 76, 77, fizz, 79, buzz, fizz, 82, 83, fizz, buzz, 86, fizz, 88, 89, fizzbuzz, 91, 92, fizz, 94, buzz, fizz, 97, 98, fizz, buzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo12() {
        val actual = fizzBuzzList(50).joinToString()
        val expected = "1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz, 16, 17, fizz, 19, buzz, fizz, 22, 23, fizz, buzz, 26, fizz, 28, 29, fizzbuzz, 31, 32, fizz, 34, buzz, fizz, 37, 38, fizz, buzz, 41, fizz, 43, 44, fizzbuzz, 46, 47, fizz, 49, buzz"
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun pippo13() {
        val actual = fizzBuzzList(35).joinToString()
        val expected = "1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz, 16, 17, fizz, 19, buzz, fizz, 22, 23, fizz, buzz, 26, fizz, 28, 29, fizzbuzz, 31, 32, fizz, 34, buzz"
        assertThat(actual).isEqualTo(expected)
    }
}
