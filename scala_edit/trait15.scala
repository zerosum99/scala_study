trait Printable{  
    def print() :Unit 
}  
  
class A4 extends Printable{  
    override def print() : Unit = {  
        println("Hello")  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]) :Unit = {  
        var a = new A4()  
        a.print()  
    }  
}  