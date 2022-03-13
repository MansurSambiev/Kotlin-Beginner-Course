/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun getAverageAge(employees: List<Employee>): Int {
    var sum = 0

    for(user in employees){
        sum += user.age
    }

    return (sum/employees.size)
}

fun main() {
    val newUser1 = Employee("John", 23)
    val newUser2 = Employee("Jack", 26)
    val newUser3 = Employee("Jim", 32)

    val users = mutableListOf(newUser1, newUser2, newUser3)

    println(getAverageAge(users))
}