const val PARI = "Pari"
const val DISPARI = "Dispari"

fun oddOrEven(list: List<Int>?): String {
    if (list.isNullOrEmpty())
        return PARI

    if (list.sum() % 2 == 0)
        return PARI
    else
        return DISPARI
}
