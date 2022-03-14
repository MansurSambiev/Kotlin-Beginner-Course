/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    for (user in users)
        return condition(user)
    return false
}

fun main() {
    val newUser = User("John", 22)
    val newUser1 = User("Jane", 20)
    val newUser2 = User("Jack", 26)
    val newUser3 = User("Jim", 32)

    val users = listOf(newUser, newUser1, newUser2, newUser3)

    println(containsElement(users){it.name.contains('X')})

}