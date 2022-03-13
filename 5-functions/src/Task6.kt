/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


fun main() {
    val auto: String = readLine()!!.toString()
    val age: Int = readLine()!!.toInt()
    val experience: Int = readLine()!!.toInt()

    println(carAvailable(auto, age, experience))
}
fun carAvailable(auto: String, age: Int, experience: Int): Boolean{
    return when {
        age >= 26 && experience >= 6 -> true
        age >= 21 && experience >= 2 && auto != "Audi" && auto != "BMW" -> true
        else -> false
    }
}