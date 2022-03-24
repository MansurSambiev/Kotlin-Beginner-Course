/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val emp1 = SomeEmployee("Andy", 120000)
    val emp2 = SomeEmployee("Anjela", 90000)
    val emp3 = SomeEmployee("Artur", 150000)

    val employees = listOf<SomeEmployee>(emp1, emp2, emp3)
    println(findEmployeeBySalary(employees, 120000)?.name)
    if (findEmployeeBySalary(employees, 120000) != null)
        println(findEmployeeBySalary(employees, 120000)?.callToClient("John"))

//    Как передать несколько элементов в println?
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Employee ${name}: call to client $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    for (employee in employees)
        if (employee.salary == salary)
            return employee
        return null
}