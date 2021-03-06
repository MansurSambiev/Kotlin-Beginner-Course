/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, которой на вход приходят возраст и стаж водителя.
Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val age: Int = readLine()!!.toInt()
    val experience: Int = readLine()!!.toInt()

    println(getAccess(age, experience))
}

fun getAccess(age: Int, experience: Int): String {
    return if (age < 21 || experience < 2)
        "Access denied"
    else if (age >= 26 || experience >= 6)
        "Special access"
    else
        "General access"
}