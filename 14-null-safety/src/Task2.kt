/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
    val address = Address( "New York")
    val company = Company("Apple", address)
    val manager = Employee("John", company)

//    Можно ли делать сквозное вложение классов при создании объекта?

    println(employeeCity(manager))
}

class Address(val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

fun employeeCity(employee: Employee): String{
    return employee.company?.address?.city ?: "Unknown"
}