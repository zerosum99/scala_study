package taitInterface

class Calcu(val x : Int, val y : Int) extends Arithm {

  override def add(): Int = x + y
  override def mul(): Int = x * y

}
