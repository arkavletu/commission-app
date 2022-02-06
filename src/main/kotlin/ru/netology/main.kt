package ru.netology
fun main() {
    val amount = 504000
    val minCommission = 3500
    val percent = 0.0075
    val commission = (percent*amount).toInt()
    val result = if (commission <= minCommission) minCommission else commission
    val rouble = result/100
    val penny = result % 100
    println("Комиссия составит $rouble рублей $penny копеек")
}