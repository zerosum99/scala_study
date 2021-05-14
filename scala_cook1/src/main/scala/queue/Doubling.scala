package queue

trait Doubling extends IntQueue {
  abstract override def put(x:Int) = {
    println(" Doubling call ")
    super.put(2* x)
  }
}
