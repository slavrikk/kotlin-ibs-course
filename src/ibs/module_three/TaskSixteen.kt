package ibs.module_three

import kotlin.math.sqrt

fun main(args: Array<String>) {

    var example: Double = 36.0;
    example.square();
}

fun Double.square() {
    print(sqrt(this))
}