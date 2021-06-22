package ibs.module_four.nineteen

import ibs.module_four.eighteen.AircraftSecond

fun main() {
    var boeing = Boeing747(1337, 200, 5000, 100)
    println(boeing.spotSize)
    println(boeing.consumption)
}

class Boeing747 : AircraftSecond {

    var spotSize: Int = 0;

    constructor(_spotSize: Int, number: Int, maxLengthTrip: Int, tankVolume: Int) :
            super(number, maxLengthTrip, tankVolume) {
        spotSize = _spotSize
    }


}