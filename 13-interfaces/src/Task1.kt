/*
Создайте интерфейс Movable (перемещаемый), в котором будут описаны функции moveLeft(step: Int), moveRight(step: Int),
moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал интерфейс Movable (скопируйте сюда код написанного
вами класса Figure)

Для этой задачи есть видео с разбором.
*/

interface Movable{
    fun moveLeft(step: Int){}
    fun moveRight(step: Int){}
    fun moveUp(step: Int){}
    fun moveDown(step: Int){}
}

abstract class Figure (val color: String, var x : Int, var y : Int) : Movable {
    abstract fun area():Double
    abstract fun perimeter():Double
    override fun moveLeft(step: Int){
        x -= step
        println("Definitions of figure is $x and $y")
    }

    override fun moveRight(step: Int){
        x += step
        println("Definitions of figure is $x and $y")
    }

    override fun moveUp(step: Int){
        y += step
        println("Definitions of figure is $x and $y")
    }

    override fun moveDown(step: Int){
        y -= step
        println("Definitions of figure is $x and $y")
    }
}