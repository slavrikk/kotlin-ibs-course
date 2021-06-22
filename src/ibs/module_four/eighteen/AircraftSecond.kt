package ibs.module_four.eighteen

fun main() {
    var air: AircraftSecond = AircraftSecond(23, 4000, 150);
    println(air.number)
    air.toString()
    println(air.consumption)
}

open class AircraftSecond(var number: Int, var maxLengthTrip: Int, var tankVolume: Int) {


    var consumption: Double = 0.0
        get() {
            return maxLengthTrip / (tankVolume * 100.0)
        }

}