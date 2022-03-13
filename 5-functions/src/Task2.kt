/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()

    val maxNum: String = getMaxText(a, b)

    println(maxNum)

}
fun getMaxText(a: Int, b: Int): String {

    return if (a > b)
        "First"
    else if (a == b)
        "Equal"
    else
        "Second"
}