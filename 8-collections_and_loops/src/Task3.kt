/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val newUser = User("John", 22, 3)
    val newUser1 = User("Jane", 20, 1)
    val newUser2 = User("Jack", 26, 8)
    val newUser3 = User("Jim", 32, 12)

    val car1 = Car("Mercedes", "E", 2.5)
    val car2 = Car("Toyota", "Prius", 1.1)
    val car3 = Car("Audi", "S", 3.6 )
    val car4 = Car("BMW", "M5", 5.1)


    val cars = listOf(car1, car2, car3, car4)

    println(carAvailable(cars, newUser))
}

fun carAvailable(cars: List<Car>, newUser: User): MutableList<List<Car>> {
    val reservedCars = mutableListOf(cars)

        if ((newUser.age < 26) || (newUser.experience < 6)) {
            reservedCars.removeAt(2)
            reservedCars.removeAt(3)
        }
        else if ((newUser.age < 21) || (newUser.experience < 2)){
            reservedCars.removeAt(0)
            reservedCars.removeAt(1)
    }

    return reservedCars
}