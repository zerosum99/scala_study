import upper._

object Main extends App {

  val up = new Upper
  println(up.upper("Hello", "World"))

  val book = "Programming Scala"
  println(book)

  println(Upper_.upper("Hello", "World"))

  val a : Int = 100
  var b : Int  = 100

  println("a =" + a + " " + "b =" + b)


}
