package ibs.module_one

fun main(args: Array<String>) {
    println("Enter two numbers:")
    var numberOne: String? = readLine();
    var numberTwo: String? = readLine();
    var result: Boolean? = numberOne!! > numberTwo!!
    println(result)
}