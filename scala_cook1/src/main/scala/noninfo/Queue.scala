package noninfo

class Queue[T] private ( private val leading : List[T],
                         private val trailing : List[T])

object Queue {
  def apply[T] (xs : T*) = {
    new Queue[T] (xs.toList, Nil)
  }

  def lquery[T] (x: Queue[T]) = x.leading
  def tquery[T] (x: Queue[T])= x.trailing
}
