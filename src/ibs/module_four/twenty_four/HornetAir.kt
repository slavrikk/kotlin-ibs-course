package ibs.module_four.twenty_four

import ibs.module_four.twenty_two.Aircraft

class HornetAir(override var number: Int,
                override var maxLengthTrip: Int,
                override var tankVolume: Int,
                override var maxSpeed: Int) : Aircraft(), SpeedLimit {

    override var consumption: Double = 0.0
        get() {
            return maxLengthTrip / (tankVolume * 100.0)
        }

    override fun showAircraftInfo() {
        println("Plane number - $number Max Length Trip - $maxLengthTrip " +
                "Tank Volume - $tankVolume Consumption - $consumption" +
                " Max Speed - $maxSpeed")
    }
}