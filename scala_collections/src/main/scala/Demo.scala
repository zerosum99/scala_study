object Demo extends App {

  println(" Hello scala collections world ")

  var z:Array[String] = new Array[String](3)
  z(0) = "Zara";z(1) = "Nuha"; z(4/2) = "Ayan";
  println("array 1 " + z)
  for ( x <- z ) {
    println( x )
  }

  println("------------------------------")
  var z1 = new Array[String](3)
  println("array 2 " + z1)

  var z2 = Array("dahl", "moon", "joon")
  println("array 3 " + z2)
  // Print all the array elements
  for ( x <- z2 ) {
    println( x )
  }

}
