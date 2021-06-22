package ibs.module_four.twenty_two

abstract class Aircraft {

    protected abstract var number: Int
    protected abstract var maxLengthTrip: Int
    protected abstract var tankVolume: Int
    protected abstract var consumption: Double

    abstract fun showAircraftInfo();

}