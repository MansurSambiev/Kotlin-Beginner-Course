/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun averageAgeOfEmployees(company: Company): Int{
    var sum = 0
    var counter = 0
    for (department in company.departments)
        for (employee in department.employees){
            sum += employee.age
            counter ++
        }
    return (sum / counter)
}

fun totalNumberOfEmployees(company: Company): Int{
    var counter = 0
    for (department in company.departments)
        counter += department.employees.size
    return counter
}

fun main() {
    val emp1 = Employee("Jack", 22)
    val emp2 = Employee("John", 25)
    val emp3 = Employee("Jim", 31)
    val emp4 = Employee("Jane", 19)

    val government = Department("Government", listOf(emp1, emp2, emp3, emp4))

    val emp5 = Employee("Jack", 45)
    val emp6 = Employee("John", 34)

    val government2 = Department("Government", listOf(emp5, emp6))

    val emp11 = Employee("Jack", 18)
    val emp21 = Employee("John", 21)
    val emp31 = Employee("Jim", 19)

    val government3 = Department("Government", listOf(emp11, emp21, emp31))

    val peak = Company("Peak", listOf(government, government3, government2))

    println(totalNumberOfEmployees(peak))
    println(averageAgeOfEmployees(peak))

}