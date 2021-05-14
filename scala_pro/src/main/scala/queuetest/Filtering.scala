package queuetest

trait Filtering extends IntQueue {
  abstract override def put(x : Int) = {
    println(" Filtering ")
    if (x >= 0) super.put(x)
  }

}
