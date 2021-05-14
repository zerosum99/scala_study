import person._

object Demo_Person extends App {

  val p = new Person("dahl", "Moon")

  p.age = 55

  println(s"age = ${p.age}")
  p.printFullName

}
