object Singleton{  
    def main(args:Array[String]):Unit = {  
        SingletonObject.hello()         // No need to create object.  
    }  
}  
  
  
object SingletonObject{  
    def hello():Unit = {  
        println("Hello, This is Singleton Object")  
    }  
}  