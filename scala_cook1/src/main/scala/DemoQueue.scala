import queue._

object  DemoQueue extends App {

  println(" Queue processing ")

  val a = new BasicIntQueue

  a.put(10)
  a.put(20)

  println(a.query)

  a.get()
  a.get()
  println(a.query)

  val m = new MyQueue
  m.put(10)
  println(m.query)
  m.get()
  println(m.query)

  val queue = new BasicIntQueue with Imcrementing with Filtering
  queue.put(-1)
  queue.put(1)
  queue.put(2)
  println(queue.query)

}
