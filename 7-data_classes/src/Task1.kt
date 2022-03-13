/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
    val newUser = User("John", 22, 3)
    val selectedCar = Car("Mercedes", 2500)

    println(carAvailable(selectedCar, newUser))
}

fun carAvailable(selectedCar: Car, newUser: User): Boolean{
    return (((newUser.age >= 21) && (newUser.experience >= 2) && (selectedCar.brand != "Audi") && (selectedCar.brand != "BMW")) || ((newUser.age >= 26) && (newUser.experience >= 6)))
}

data class User(val name: String, val age: Int, val experience: Int)
data class Car(val brand: String, val cost: Int)