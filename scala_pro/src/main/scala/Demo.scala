import queuetest.{BasicIntQueue, MyQueue}

object Demo {

  def main(args : Array[String]) :Unit = {
    println(" scala project ")

    val c = new CallExtends
    c.call()

    println(c.add(10,10) + " " + c.mul(10,10))


    import bobsrockets.navigation._
    val n = new Navigator
    println(" package " + n)

    println("=" * 30 )
    import iterator._

    val iter = new IntIterator(10)
    println(iter.next()) // returns 0
    println(iter.next()) // returns 1



  }

}
