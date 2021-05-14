import noninfo._


object DemoInfo extends App {

  val queue = Queue(1,2,3,4)

  println(Queue.lquery[Int](queue))

}
