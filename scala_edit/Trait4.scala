

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}

class IntIterator(val to: Int) extends Iterator[Int] {
  private var current_ = 0
  override def hasNext: Boolean = current_ < to
  override def next(): Int = {
    if (hasNext) {
      val t = current_
      current_ += 1
      t
    } else 0
  }

  def current  = current_
}


val iterator = new IntIterator(10)
println(iterator.next()) // returns 0
println(iterator.next())  // returns 1
println(iterator.to)
println(iterator.current)