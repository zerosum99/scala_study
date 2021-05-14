import traitTest1._

object DemotraitTest1 extends App {
  val service1 = new ServiceImportance("uno")
  (1 to 3) foreach(i => println(s" Result : ${service1.work(i)}"))

  println("+" * 50)

  val service2 = new ServiceImportance("dos") with StdoutLogging {
    override def work(i : Int) = {
      info(s"Starting work : i = $i")
      val result = super.work(i)
      info(s"Ending work : i = $i, result = $result")
      result
    }
  }

  (1 to 3) foreach(i => println(s" Result : ${service2.work(i)}"))
}
