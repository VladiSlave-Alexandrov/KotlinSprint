package lesson2

fun main(){
    val staff = 50
    val staffSalary = 30000

    val interns = 30
    val internsSalary = 20000

    val staffSalaryCosts = staff * staffSalary
    val salaryCosts = staffSalaryCosts + interns * internsSalary
    val midSalary = salaryCosts / (staff + interns)

    println(staffSalaryCosts)
    println(salaryCosts)
    println(midSalary)
}