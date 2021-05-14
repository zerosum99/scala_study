package queuetest

trait Incrementing extends IntQueue {

  abstract override def put(x: Int): Unit = {
    println(" Incrementing ")
    super.put(x +1 )
  }

}
