/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.

Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)

Создайте объект класса Round и проверьте работоспособность написанных функций
*/
fun main() {
    val fig1 = Round(6)
    println(fig1.area())
    println(fig1.perimeter())

}

class Round (var radius: Int){
    fun area():Double{
        return Math.PI* radius * radius
    }

    fun perimeter():Double{
        return 2*Math.PI*radius
    }
}