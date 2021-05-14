package queue

trait Imcrementing extends IntQueue {

  abstract override def put(x:Int) = {
    println(" Imcrementing call ")
    super.put(x+1)
  }

}
