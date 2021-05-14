trait Logger {
    def log(msg:String) : Unit  //추상메소드 
}

class ConsoleLogger extends Logger {
    def log(msg:String):Unit =  {println(msg)}
}

val c = new ConsoleLogger()


c.log(" Test")