package ibs.module_four.seventeen

fun main() {
    var air: Aircraft = Aircraft();
    println(air.consumption)
}

class Aircraft {

    var number: Int = 100;
    var maxLengthTrip: Int = 5000
    var tankVolume: Int = 1000
    var consumption: Double = 0.0
        get() {
            return maxLengthTrip / (tankVolume * 100.0)
        }


}