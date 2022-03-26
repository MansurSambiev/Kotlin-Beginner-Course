/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val emp1 = SomeEmployee("Andy", 120000)
    val emp2 = SomeEmployee("Anjela", 90000)
    val emp3 = SomeEmployee("Artur", 150000)

    val employees = listOf<SomeEmployee>(emp1, emp2, emp3)

    try{
        val newEmp = findEmployeeBySalary(employees, 10000)
        println(newEmp.name)
    }
    catch (e: Exception){
        println(e.message)
    }

}

class SomeEmployee(
    val name: String,
    val salary: Int,
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {
    for (employee in employees)
        if (employee.salary == salary)
            return employee
    return throw Exception("Employee not found")
//    Unreachable code?
}