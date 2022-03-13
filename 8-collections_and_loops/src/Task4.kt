/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun getAverageAgeOfEmp(department: Department): Int{
    var sum = 0
    val emps = department.employees
    for (emp in emps)
        sum += emp.age
    return (sum / emps.size)
}

fun main() {
    val emp1 = Employee("Jack", 22)
    val emp2 = Employee("John", 25)
    val emp3 = Employee("Jim", 31)
    val emp4 = Employee("Jane", 19)

    val employees = listOf(emp1, emp2, emp3, emp4)

    val government = Department("Government", employees)

    println(getAverageAgeOfEmp(government))
}
