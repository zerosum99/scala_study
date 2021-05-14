package queue

trait Filtering extends IntQueue {
   abstract override def put(x:Int) = {
     println(" Filtering call ")
     if (x>=0) super.put(x)
   }
}
