
trait Car { val brand: String } 

trait Shiny { val shineRefraction: Int }


class BMW extends Car with Shiny { 
    val brand = "BMW" 
    val shineRefraction = 12 
}

val b = new BMW()

println(b.brand, b.shineRefraction)
