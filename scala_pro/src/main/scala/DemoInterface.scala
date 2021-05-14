import taitInterface._

object DemoInterface {
  def main(args : Array[String]) = {
    val c = new Calcu(10,10)
    println(c.add)
    println(c.mul)
  }

}
