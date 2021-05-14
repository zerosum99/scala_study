class ComapanionClass{  
    def hello(): Unit = {  
        println("Hello, this is Companion Class.")  
    }  
}  
object CompanoinObject{  
    def main(args:Array[String]) : Unit = {  
        new ComapanionClass().hello()  
        println("And this is Companion Object.")  
    }  
}  