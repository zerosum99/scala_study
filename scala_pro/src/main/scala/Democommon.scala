import traitcommon._
object Democommon {

  def main(args : Array[String]) = {
    val c = new Common(10,10)
    println(c.add())
    println(c.mul())

    val c_ = new Common_(10,10)
    println(c_.add())
    println(c_.mul())
  }

}
