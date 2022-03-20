/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.

Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))

Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)

Создайте объект класса Rectangle и проверьте работоспособность написанных функций
*/

fun main() {
    val fig1 = Rectangle(6, 6)
    println(fig1.area())
    println(fig1.perimeter())
    println(fig1.isSquare())

}

class Rectangle (var width: Int, var height: Int){
    fun area():Int{
        return width * height
    }

    fun perimeter():Int{
        return 2*(width+height)
    }

    fun isSquare():Boolean{
        return width == height
    }
}