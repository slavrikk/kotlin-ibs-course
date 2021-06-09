package ibs.module_one

fun main(args: Array<String>) {
   var range = buildString {
        for (letter in 'Z' downTo 'A')
            append(letter)
    }
    var one = true
    var two = false

    print(range)
}