package ibs.module_four.twenty_two

import ibs.module_four.twenty.Passenger
import java.math.RoundingMode

fun main() {
    var aircraft: Aircraft = Boeing747(200, 100, 4000, 150)
    aircraft.showAircraftInfo()
}

class Boeing747(_passengerSize: Int,
                protected override var number: Int,
                protected override var maxLengthTrip: Int,
                protected override var tankVolume: Int) : Aircraft(), Passenger {

    override var passengerSize: Int = _passengerSize

    override var consumption: Double = 0.0
        get() {
            return (maxLengthTrip / (tankVolume * 100.0))
                    .toBigDecimal()
                    .setScale(2, RoundingMode.UP)
                    .toDouble()
        }

    override fun showAircraftInfo() {
        println("Plane number - $number Max Length Trip - $maxLengthTrip " +
                "Tank Volume - $tankVolume Consumption - $consumption" +
                " Passenger Size - $passengerSize")
    }

}