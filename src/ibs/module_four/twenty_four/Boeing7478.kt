package ibs.module_four.twenty_four

import ibs.module_four.twenty.Passenger
import ibs.module_four.twenty_two.Aircraft

class Boeing7478(override var passengerSize: Int,
                 override var number: Int,
                 override var maxLengthTrip: Int,
                 override var tankVolume: Int) : Passenger, Cargo, Aircraft() {

    override var liftingCapacity: Int = 10000
    private val consumptionCoefficient: Double = 0.5
    override var consumption: Double = 0.0
        get() {
            return maxLengthTrip / (tankVolume * consumptionCoefficient * 100.0)
        }

    override fun showAircraftInfo() {
        println("Plane number - $number Max Length Trip - $maxLengthTrip " +
                "Tank Volume - $tankVolume Consumption - $consumption" +
                " Passenger Size - $passengerSize Lifting Capacity - $liftingCapacity")
    }


}