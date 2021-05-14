object func2 {
   def main(args: Array[String]) {
      println( s"""Returned Value : ${addInt(5,7)}""".stripMargin )
   }
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b 
      sum
    }
   

}

