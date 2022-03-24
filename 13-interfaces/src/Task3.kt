/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val round = Round("grey", 3, -1, 4)
    val rect = Rectangle("green", 2, 3, 6, 1)
    val zoo = Animal("lion", 4, 9)

    val list = listOf<Movable>(round, rect, zoo)
    for (i in list)
        i.moveRight(10)
}

class Round(color: String, private val radius: Int, x : Int, y: Int): Figure (color, x, y){
    override fun area():Double{
        return Math.PI* radius * radius
    }

    override fun perimeter():Double{
        return 2*Math.PI*radius
    }
}

class Rectangle (color: String, private val width: Int, private val height: Int, x : Int, y: Int): Figure (color, x, y){
    override fun area():Double{
        return (width * height).toDouble()
    }

    override fun perimeter():Double{
        return (2*(width+height)).toDouble()
    }
}