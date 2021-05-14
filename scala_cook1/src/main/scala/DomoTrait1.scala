import trait1._

object DomoTrait1 extends App {

  println(" DemoTraint1 call ")

  val a = new Enterprise

  println(a)
  println(a.b)
  a.c()
  // trait self type 오류
  //val n = new Warbird
  //println(n)

}
