package lesson_2

fun main() {

    val numberOfStaff = 50
    val wage = 30000
    val numberOfInterns = 30
    val wageOfIntern = 20000
    val wageFund = numberOfStaff*wage
    val newWageFund = wageFund + numberOfInterns * wageOfIntern

    println(wageFund)
    println(newWageFund)
    println(newWageFund/(numberOfStaff + numberOfInterns))
}