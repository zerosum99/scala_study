import caseclass._


object MainTest extends App {

  println("  Main Test ")

  val v = Var("x")
  println(v.name)
  val op = BinOP("+", Number(10), v)
  println(op.left  + "  " + op.operator + " " + op.right)

  val n = Number(10)
  println(n.num)

  println(op.copy(operator = "-"))

}