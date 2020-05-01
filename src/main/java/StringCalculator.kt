import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun stringCalculator(value: String): Int {
    if (value.isBlank()) return 0

    val simplifiedValue = value
        .replace(" ", "")
        .replace("\n", ",")

    val list = simplifiedValue.split(",")
    var finalValue = 0

    try{
        for (element in list) {
            finalValue += element.toInt()
        }
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("Input \"$value\" not valid")
    }

    return finalValue
}
