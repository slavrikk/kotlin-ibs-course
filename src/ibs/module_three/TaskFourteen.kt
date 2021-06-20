package ibs.module_three

fun main(args: Array<String>) {

    employeeInfo(fullName = "Bob Martin",position = "Manager")
    employeeInfo("Bob Martin",26,"Manager")
    employeeInfo("Bob Martin", "married","Manager")
    employeeInfo("Bob Martin", 26,"married","Manager")

}

fun employeeInfo(fullName:String,position:String){

    println("name - $fullName position - $position")
}

fun employeeInfo(fullName:String,age:Int,position:String){

    println("name - $fullName age - $age position - $position")
}

fun employeeInfo(fullName:String,mutualStatus:String,position:String){

    println("name - $fullName Mutual Status - $mutualStatus position - $position")
}

fun employeeInfo(fullName:String,age:Int,mutualStatus:String,position:String){

    println("name - $fullName age - $age Mutual Status - $mutualStatus position - $position")
}