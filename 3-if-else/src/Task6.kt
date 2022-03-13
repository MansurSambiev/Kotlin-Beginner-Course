/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
    val auto: String = readLine()!!.toString()
    val age: Int = readLine()!!.toInt()
    val experience: Int = readLine()!!.toInt()

    val carAvailable = when {
        age >= 26 && experience >= 6 -> "Available"
        age >= 21 && experience >= 2 && auto != "Audi" && auto != "BMW" -> "Available"
        else -> "Not available"
    }
    println(carAvailable)
}