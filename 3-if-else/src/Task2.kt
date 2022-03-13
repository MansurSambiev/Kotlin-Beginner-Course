/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    val number1: Int = 33
    val number2: Int = 32
    if (number1 > number2)
        println("First")
    else if (number1 == number2)
        println("Equal")
    else
        println("Second")
}