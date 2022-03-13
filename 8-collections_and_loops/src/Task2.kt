/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun getMinAge(employees: List<Employee>): String{
    var min = 100
    var younger: String = "1"

    for(user in employees){
        if (user.age < min){
            min = user.age
            younger = user.name
        }
    }
    return younger
}

fun main() {
    val newUser1 = Employee("John", 42)
    val newUser2 = Employee("Jack", 26)
    val newUser3 = Employee("Jim", 32)

    val users = listOf(newUser1, newUser2, newUser3)

    println(getMinAge(users))
}