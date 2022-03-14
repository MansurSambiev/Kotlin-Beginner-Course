/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>{
    val stringOfUsers = mutableListOf<String>()
    for (user in users)
        stringOfUsers.add(conversion(user))
    return stringOfUsers
}

fun main() {
    val newUser = User("John", 22)
    val newUser1 = User("Jane", 20)
    val newUser2 = User("Jack", 26)
    val newUser3 = User("Jim", 32)

    val users = listOf(newUser, newUser1, newUser2, newUser3)

    println(convertToStrings(users){"Name: ${it.name}. Age ${it.age}"})
}