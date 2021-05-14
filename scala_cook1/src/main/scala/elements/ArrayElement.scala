package elements

class ArrayElement(conts : Array[String]) extends Element {
  override def contents: Array[String] = conts

  override def demo() = { println("ArrayElement is implementation invoked")}

}
