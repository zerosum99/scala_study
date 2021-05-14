trait Printable{  
    def print() : Unit 
}  
  
trait Showable{  
   def show()  : Unit
}  
  
class A6 extends Printable with Showable{  
    override def print():Unit = {  
        println("This is printable")  
    }  
    override def show(): Unit = {  
        println("This is showable");  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]):Unit = {  
        var a = new A6()  
        a.print()  
        a.show()  
    }  
}  