package ibs.module_three

fun main(args: Array<String>) {
    var array = arrayOf("One", "Two", "Three")
    var outPutArray = { arr: Array<String> -> arr.forEach { println(it) } }
    outPutArray(array)

}