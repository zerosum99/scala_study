

trait Philosophical { 
    def philosophize() : Unit = { 
        println("I consume memory, therefore I am!")
     }
        
    
}

class Frog extends Philosophical { 
    override def toString = "green" 
}


val frog = new Frog

frog.philosophize()


class Animal 

class Frog_ extends Animal with Philosophical { 
    
    override def toString = "green" 
    override def philosophize(): Unit = { println("It ain't easy being "+ toString +"!") }

}

val f = new Frog_

println(f.toString)

f.philosophize()