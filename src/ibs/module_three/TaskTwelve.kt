package ibs.module_three


fun main(args: Array<String>) {
    println("Input year for leap checking (range 1600-2200:")
    var year: String? = readLine();
    println(checkLeapYear(year!!.toInt()))
}

fun checkLeapYear(year: Int): Boolean {
    val array = initLeapYears();
    if (array.contains(year)) {
        return true;
    }
    return false;
}

fun initLeapYears(): IntArray {
    val array: IntArray = IntArray(151) { 1600 + it * 4 };
    return array
}