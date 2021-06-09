package ibs.module_two

fun main(args: Array<String>) {
    println("Input deposit:")
    var deposit: String? = readLine();

    println("Input percent:")
    var percent: String? = readLine();

    println("Input month:")
    var monthes: String? = readLine();

    for (month in 1..monthes!!.toInt()) {
        var income: Double = (deposit!!.toDouble() * percent!!.toDouble() * month / (100.0 * 12.0))
        var totalIncome = income + deposit.toDouble();
        println("Month: $month , Income by percent: $income , Total deposit in this month: $totalIncome")
    }
}