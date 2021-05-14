//package introscala

object Upper {
  def main(args : Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println()
  }
}

class A {
  def get : String = " class A "
}
