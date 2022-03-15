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
