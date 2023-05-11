package lesson2

import kotlin.math.pow

fun main(){
    val deadLine = 20
    val deposit = 70000
    val interestRate = 16.7

    val finalPayment = (deposit * ((1 + interestRate / 100).pow(deadLine)))
    println(String.format("%.3f", finalPayment) )
}