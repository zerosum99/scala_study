import extendsTest._

object DemoEx extends  App {

  println(" call DeomEx ")

  val p = new Person
  p.getPerson()

  val m = new Man
  m.getPerson()

  val o = new Other with PTrait
  o.getPerson()

}
