package ibs.module_four.twenty_three

fun main() {
    var bmw: Car<String> = Car("111", "BMW", "RED")
    var audi: Car<Int> = Car(777, "AUDI", "WHITE")
    bmw.carInfo()
    audi.carInfo()
}

data class Car<T>(var number: T, var model: String, var color: String) {

    fun carInfo() {
        println("Number - $number Model - $model Color - $color")
    }
}