package ibs.module_two

fun main(args: Array<String>) {

    val personPlaces = mutableMapOf<Int, String>()
    personPlaces[1] = "Ivanov"
    personPlaces[2] = "Petrov"
    personPlaces[3] = "Sidorov"

    loop@ while (true) {
        println("Input action: 1 - add person place 2 - look at person by place number 3 - quit")
        when (readLine()) {
            "1" -> {
                println("Input place number:")
                val placeNumber: String? = readLine();
                println("Input person name")
                val personName: String? = readLine();
                try {
                    personPlaces.put(placeNumber!!.toInt(), personName!!)
                } catch (e: NumberFormatException) {
                    println("Input valid number!")
                }
            }
            "2" -> {
                println("Input place number:")
                val placeNumber: String? = readLine();
                println(personPlaces.get(placeNumber?.toInt()))
            }
            "3" -> break@loop;
            else -> println("Wrong action!")
        }
    }
}