fun leapYear(year: Long): Boolean? {

    //Prima del 4 nessun anno è bisestile
    if(year < 4)
        return false

    //Dall'anno 4 al 1580 le regole erano più semplici
    //Si guarda semplicemente se l'anno è divisibile per 4
    if (year in 5..1579)
        return year % 4.toLong() == 0.toLong()

    //Dal 1580 il puttanaio
    return when {
        //Un secolo è bisestile solo se anche divisibile per 400
        year % 400.toLong() == 0.toLong() -> true
        //Un secolo non divisibile per 400 non è bisestile
        year % 100.toLong() == 0.toLong() -> false
        //Un anno divisibile per 4 è bisestile
        year % 4.toLong() == 0.toLong() -> true
        //Ogni altro anno non è bisestile
        else -> false
    }
}

@Deprecated ("Int input is deprecated", ReplaceWith("leapYear(year.toLong())"))
fun leapYear(year: Int): Boolean? {
    return leapYear(year.toLong())
}
