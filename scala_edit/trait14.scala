object Demo {
   val greeting: String = "Hello, world!"

   def main(args: Array[String]) : Unit = {

      val s = new Score("aaa", "bbbb")
      println( " composer :" + s.compose() + "engineer :" + s.produce() )

      def total(x:Int*) : Int = {
         x.sum
     }

      println(" sum" + total(1,2,3,4))
   }
}


trait Composition {
  
  def compose(): String
}

trait SoundProduction {
  
  def produce(): String
}

class Score(var composer: String, var engineer: String)
  extends Composition with SoundProduction {

  override def compose(): String = s"The score is composed by $composer"

  override def produce(): String = s"The score is produced by $engineer"
}

