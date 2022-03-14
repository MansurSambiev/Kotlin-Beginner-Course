/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int {
    var counter = 0
    for (user in users)
        if (condition(user))
            counter ++
    return counter
}

fun main() {
    val newUser = User("John", 22)
    val newUser1 = User("Jane", 20)
    val newUser2 = User("Jack", 26)
    val newUser3 = User("Jim", 32)

    val users = listOf(newUser, newUser1, newUser2, newUser3)

    println(elementsCount(users){it.name.contains('X')})

}