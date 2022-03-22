/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/

fun main(){
    val fig1 = Rectangle("Blue", 12, 5)
    val fig2 = Round("red", 3)
    println(fig1.area())
    println(fig2.perimeter())
}

abstract class Figure (val color: String) {
    abstract fun area():Double
    abstract fun perimeter():Double
}

class Round(color: String, private val radius: Int): Figure (color){
    override fun area():Double{
        return Math.PI* radius * radius
    }

    override fun perimeter():Double{
        return 2*Math.PI*radius
    }
}

class Rectangle (color: String, private val width: Int, private val height: Int): Figure (color){
    override fun area():Double{
        return (width * height).toDouble()
    }

    override fun perimeter():Double{
        return (2*(width+height)).toDouble()
    }
}