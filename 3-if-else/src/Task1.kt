/* Вывести на экран большее из двух целых чисел. */
fun main(){
    val number1: Int = 23
    val number2: Int = 32
    val max: Int = if (number1 > number2)
        number1
    else
        number2
    println(max)
}