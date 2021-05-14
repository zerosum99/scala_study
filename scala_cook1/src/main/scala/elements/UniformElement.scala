package elements

class UniformElement (ch : Char, override val width : Int, override val height : Int) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)

  override def demo() = { println("UniformElement is implementation invoked")}

}
