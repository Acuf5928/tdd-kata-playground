
fun fizzBuzz(i: Int): String {
    return when {
        i <= 0 -> ""
        i > 100 -> ""
        i % 15 == 0 -> "fizzbuzz"
        i % 3 == 0 -> "fizz"
        i % 5 == 0 -> "buzz"
        else -> i.toString()
    }
}

fun fizzBuzzList(end: Int): List<String> {
    val list = mutableListOf<String>()

    for (i in 1..end)
        list.add(fizzBuzz(i))

    return (list)
}

fun main() {
    print(fizzBuzzList(20))
}
