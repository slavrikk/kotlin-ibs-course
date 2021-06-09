package ibs.module_two

fun main(args: Array<String>) {

    val city = mutableListOf<String>()
    loop@ while (true) {
        println("Input action: 1 - add city 2 - look at list of cities 3 - look at unrepeatable cities 4 - quit")
        when (readLine()) {
            "1" -> {
                println("Input city:")
                city.add(readLine()!!)
                println("City is added")
            }
            "2" -> {
                println("List of cities:")
                for (c in city) {
                    println(c)
                }
            }
            "3" -> {
                println("Unrepeatable List of cities:")
                val unrepeatableCity = mutableSetOf<String>()
                for (c in city) {
                    unrepeatableCity.add(c);
                }
                for (c in unrepeatableCity) {
                    println(c)
                }
            }
            "4" -> break@loop;
            else -> println("Wrong action!")
        }
    }
}