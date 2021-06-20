package ibs.module_three

fun main(args: Array<String>) {
    println(determineCountOfStudents("Bob","Tom","Sam"))
}

fun determineCountOfStudents(vararg strings: String) : Int{
    return strings.size;
}