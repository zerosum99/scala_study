object Demo_list2 {
  def main(args: Array[String]) {
    val fruit = List.fill(3)("apples") // Repeats apples three times.
    println( "fruit : " + fruit  )
    val num = List.fill(10)(2)         // Repeats 2, 10 times.
    println( "num : " + num  )
    println("--------------------")
    // Creates 5 elements using the given function.
    val x = List.tabulate(5)(n => n)
    println(x)
    val squares = List.tabulate(6)(n => n * n)
    println( "squares : " + squares  )
    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "mul : " + mul  )
  }
}
