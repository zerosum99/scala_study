object Demo_recFact extends App
{
  def fac(n:Int, acc : Int =1) : Int = if (n <= 0) acc  else fac(n-1, n * acc)

  println("tail recursion :" + fac(5))

  println(List(1,2,3,4,5).product)

  println("tail recursion 100:" + fac(10))

  println(List(1 to 10 :_*).product)


}
