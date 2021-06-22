package ibs.module_four.twenty

import ibs.module_four.eighteen.AircraftSecond

fun main() {
    var boeing = Boeing747(1337, 200, 5000, 100)
    println(boeing.passengerSize)
    println(boeing.consumption)
}

class Boeing747 : AircraftSecond, Passenger {

    override var passengerSize: Int

    constructor(_passengerSize: Int, number: Int, maxLengthTrip: Int, tankVolume: Int) :
            super(number, maxLengthTrip, tankVolume) {
        passengerSize = _passengerSize
    }
}