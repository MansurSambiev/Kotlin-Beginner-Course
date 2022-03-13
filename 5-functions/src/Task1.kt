/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()

    val maxNum: Int = getMaxNum(a, b)

    println(maxNum)

}
fun getMaxNum(a: Int, b: Int): Int {

    return if (a > b)
        a
    else
        b
}