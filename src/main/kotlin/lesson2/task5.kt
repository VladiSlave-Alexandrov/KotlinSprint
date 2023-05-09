package lesson2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main(){
    val deadLine = 20
    val deposit = 70000
    val interestRate = 0.167

    val finalPayment = ((deposit * ((1 + interestRate).pow(deadLine))) * 1000.0).roundToInt() / 1000.0
    println(finalPayment)
}