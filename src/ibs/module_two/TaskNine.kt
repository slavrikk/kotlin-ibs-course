package ibs.module_two

fun main(args: Array<String>) {

    val array = arrayOf(
        arrayOf("Germany", "USA", "China"),
        arrayOf("Berlin", "Washington", "Peking"),
        arrayOf("EUR", "USD", "CNY")
    )

    for (i in array.indices) {
        val country = array[0][i]
        val city = array[1][i]
        val currency = array[2][i]
        println("$country $city $currency")
    }

}