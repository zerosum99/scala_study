package elements

abstract class Element {
   def contents : Array[String]
   def height : Int = contents.length
   def width : Int = if (height == 0) 0 else contents(0).length

   def above(that :Element) = {
     //new ArrayElement((this.contents ++ that.contents))
     ElementFactory.elem(this.contents ++ that.contents)
   }

  def beside(that : Element) :Element = {
    //new ArrayElement(for ((line1, line2) <- this.contents zip that.contents ) yield line1 + line2)
    ElementFactory.elem(for ((line1, line2) <- this.contents zip that.contents ) yield line1 + line2)
  }

   def demo() = { println("Element is implementation invoked")}
}
