package elements

class LineElement (s:String) extends ArrayElement (Array(s)) {
  override def width: Int = s.length

  override def height: Int = 1

  override def demo() = { println("LineElement is implementation invoked")}

}
