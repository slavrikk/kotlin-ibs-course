package ibs.module_four.twenty_four

import ibs.module_four.twenty_two.Aircraft
import ibs.module_four.twenty_two.Boeing747

fun main() {
    val boeing7478: Aircraft = Boeing7478(1000, 7478, 5000, 2000)
    val boeing747: Aircraft = Boeing747(500, 747, 3000, 500)
    val hornetAir: Aircraft = HornetAir(18, 7000, 100, 1000)
    val array: Array<Aircraft> = arrayOf(boeing747, boeing7478, hornetAir)

    loop@ while (true) {
        println("The Air Company has several types of airplanes:" +
                "\n Boeing 747-8 \n Boeing 747 \n F/A-18 Hornet " +
                "\n To show info about: " +
                "\n Boeing 747-8 - input 1 \n Boeing 747 - input 2 \n F/A-18 Hornet - input 3" +
                "\n For Exit - input 0 ")
        when (readLine()) {
            "1" -> {
                array[0].showAircraftInfo()
            }
            "2" -> {
                array[1].showAircraftInfo()
            }
            "3" -> {
                array[2].showAircraftInfo()
            }
            "0" -> break@loop
            else -> println("Wrong action!")
        }
    }

}