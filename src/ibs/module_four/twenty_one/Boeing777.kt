package ibs.module_four.twenty_one

class Boeing777(override var number: Int,
                override var maxLengthTrip: Int,
                override var tankVolume: Int) : Aircraft() {

    override var consumption: Double = 0.0
        get() {
            return maxLengthTrip / (tankVolume * 100.0)
        }

}