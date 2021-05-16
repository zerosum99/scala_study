import scala.collection.mutable


object Demo_collections extends App {

  val a = Array(1,2,3,4)
  val vr = for (i <- a.reverse) yield i
  println(vr.toList)
  var a1: Array[Int] =a :+ 5;
  println(a1 +" "+ a1.toList)

  val l = List(1,2,3,4)
  println(l.reverse)
  var l1: List[Int] = l :+ 5;
  println(l1)

  val v = Vector(1,2,3,4)
  println(v.reverse)
  var v1: Vector[Int] = v :+ 5;
  println(v1)

  val ints = List(1, 2, 3, 4, 5)
  for (i<- ints if i %2 == 0) println(i)           // 3버전 for i <- ints do println(i)

  val doubles = for (i <- ints) yield i * 2
  println(doubles)

  val i = 1

  // later in the code ...
  i match {
    case 1 => println("one")
    case 2 => println("two")
    case _ => println("other")
  }
}
