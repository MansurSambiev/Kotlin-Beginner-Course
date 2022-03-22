import kotlin.math.sqrt
import kotlin.math.pow


/*
Добавить еще один класс Triangle – тоже наследник Figure (который вы сделали в предыдущем задании)
и прописать работу функций area() и length() для него

Для этой задачи есть видео с разбором.
*/

fun main(){
    val fig3 = Triangle("green", 2.1, 3.5)
    println(fig3.area())
    println(fig3.perimeter())
}

class Triangle(color: String, private val width: Double, private val height: Double):Figure(color){
    override fun area(): Double {
        return (width*height/2)
    }

    override fun perimeter(): Double {
        return (sqrt(height.pow(2) + width.pow(2)) + height + width)
    }
}