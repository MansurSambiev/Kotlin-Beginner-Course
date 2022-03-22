/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/
fun main(){
    val fig1 = Rectangle("Blue", 2, 3, 15, 24)
    fig1.moveLeft(5)
}


open class Figure (val color: String, var x: Int = 0, var y: Int = 0) {
    fun moveLeft(step: Int){
        x -= step
        println("Definitions of figure is $x and $y")
    }

    fun moveRight(step: Int){
       x += step
       println("Definitions of figure is $x and $y")
    }

    fun moveUp(step: Int){
        y += step
        println("Definitions of figure is $x and $y")
    }

    fun moveDown(step: Int){
        y -= step
        println("Definitions of figure is $x and $y")
    }
}

class Round(color: String, x: Int = 0, y: Int = 0, private val radius: Int): Figure (color, x, y){
    fun area():Double{
        return Math.PI* radius * radius
    }

    fun perimeter():Double{
        return 2*Math.PI*radius
    }
}

class Rectangle (color: String, x: Int = 0, y: Int = 0, private val width: Int, private val height: Int): Figure (color, x, y){
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